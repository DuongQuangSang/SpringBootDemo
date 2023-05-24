package jp.dcnet.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.dcnet.model.Product;

@Repository
public interface ProductRepository extends  JpaRepository<Product, Long> {
	List<Product> findByName(String name);
	List<Product> findByStartDateBeforeAndEndDateAfter(LocalDateTime startDate, LocalDateTime  endDate);
	List<Product> findByAttributeName(String attributeName);
}
