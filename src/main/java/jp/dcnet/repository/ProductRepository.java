package jp.dcnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.dcnet.obj.Product;

@Repository
public interface ProductRepository extends  JpaRepository<Product, Long > {
	
}
