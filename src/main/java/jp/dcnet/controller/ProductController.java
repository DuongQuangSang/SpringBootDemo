package jp.dcnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.dcnet.obj.Product;
import jp.dcnet.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
    public String viewAdminPage(Model model) {
		List<Product> listProduct = productService.getAllProducts();
		model.addAttribute("listProduct",listProduct);
        return "index";
    }
    
	@RequestMapping("/new")
	public String newProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product",product);
        return "new_form";
    }
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertProduct(@ModelAttribute("product") Product product) {
		productService.saveProduct(product);
		
		return "redirect:/";
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteProduct(@ModelAttribute("product") Product product) {
		productService.deleteProduct(product.getProduct_id());
		
		return "redirect:/";
    }
	
	@RequestMapping("/edit/{product_id}")
	public ModelAndView editProduct(@PathVariable(name ="product_id") int product_id) {
		ModelAndView mav = new ModelAndView("edit");
		
		Product product = productService.getProductById((long) product_id);
		mav.addObject("product",product);
		
        return mav;
    }
}
