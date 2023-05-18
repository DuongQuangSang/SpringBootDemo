package jp.dcnet.ecs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductsDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public ProductsDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Product> list() {
		String sql = "SELECT * FROM product";
		List<Product> listProduct = jdbcTemplate.query(sql, 
				BeanPropertyRowMapper.newInstance(Product.class));
		return listProduct;
	}

	public void insert(Product product) {

	}

	public Product get(int id) {
		return null;
	}

	public void update(Product product) {

	}
	
	public void delate(int id) {

	}
}
