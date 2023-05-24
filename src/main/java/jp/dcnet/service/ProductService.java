package jp.dcnet.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.dcnet.model.Product;
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
    
    public List<Product> searchProductByName(String name) {
    	return repo.findByName(name);
    }
    
    public List<Product> searchProductByTimeRange(LocalDateTime currentTime) {
        return repo.findByStartDateBeforeAndEndDateAfter(currentTime, currentTime);
    }
    
    public List<Product> sortByAttributeName(String attributeName) {
    	return repo.findByAttributeName(attributeName);
    }
    
//    @Transactional
    public Product update(Product product) {
    	Product updateResponse = repo.save(product);
        return updateResponse;
    }
}
