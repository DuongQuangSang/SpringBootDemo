package jp.dcnet.ecs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.dcnet.ecs.Product;
import jp.dcnet.ecs.ProductsDAO;

@Controller
public class AppController  {
	@Autowired
	private ProductsDAO dao;
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
	@RequestMapping("/")
	public String viewAdmin(Model model) {
		List<Product> listProduct = dao.list();
		model.addAttribute("listProduct",listProduct);
        return "index";
    }
}
