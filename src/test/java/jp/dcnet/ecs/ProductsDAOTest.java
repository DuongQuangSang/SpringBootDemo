package jp.dcnet.ecs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

class ProductsDAOTest {
	private ProductsDAO dao;
	@BeforeEach
	void setUp() throws Exception {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl("jdbc:postgresql://localhost:5432/postgres");
		datasource.setUsername("postgres");
		datasource.setPassword("postgres");
		datasource.setDriverClassName("org.postgresql.Driver");
		
		dao = new ProductsDAO(new JdbcTemplate(datasource));
	}

	@Test
	void testList() {
		List<Product> listProduct = dao.list();
		
		assertTrue(!listProduct.isEmpty());
	}

	@Test
	void testInsert() {
		fail("まだ実装されていません");
	}

	@Test
	void testGet() {
		fail("まだ実装されていません");
	}

	@Test
	void testUpdate() {
		fail("まだ実装されていません");
	}

	@Test
	void testDelate() {
		fail("まだ実装されていません");
	}

}
