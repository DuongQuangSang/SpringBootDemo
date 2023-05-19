package jp.dcnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.dcnet.obj.Product;
import jp.dcnet.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
    public ProductRepository repo ;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(Long product_id) {
        return repo.findById(product_id).get();
    }

    public Product saveProduct(Product product) {
        return repo.save(product);
    }

    public void deleteProduct(Long product_id) {
    	repo.deleteById(product_id);
    }
    
    
}
