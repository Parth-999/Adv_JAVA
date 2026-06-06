package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean saveProduct(Product p) {
		
		int n = jdbcTemplate.update("insert into Product1 values(?,?,?,?,?,?)", new Object[] {p.getPid(),p.getPname(),p.getQty(),p.getPrice(),p.getMfgDte(),p.getCid()});
		
		return n>0;
		
	}

	@Override
	public boolean removeById(int pid) {
		
		int n = jdbcTemplate.update("delete from Product1 where pid=?",new Object[] {pid});
		
		return n>0;
	}

	@Override
	public boolean modifyById(int pid, int qty, double p) {
		int n = jdbcTemplate.update("update Product1 set qty=?,price=? where pid=?",new Object[] {qty,p,pid});
		
		return n>0;
	}

	@Override
	public List<Product> getAll() {
		List<Product> plist = jdbcTemplate.query("select * from Product1",(rs,num)->{
					Product p = new Product();
					p.setPid(rs.getInt(1));
					p.setPname(rs.getString(2));
					p.setQty(rs.getInt(3));
					p.setPrice(rs.getDouble(4));
					p.setMfgDte(rs.getDate(5).toLocalDate());
					p.setCid(rs.getInt(6));
					
					return p;
				});
		return plist;
	}

	@Override
	public Product getById(int pid) {
		Product p1 = jdbcTemplate.queryForObject("select * from Product1 where pid=?",new Object[] {pid}, new BeanPropertyRowMapper<>(Product.class));
		
		return p1;
		
	}

	@Override
	public List<Product> getByPrice(double price) {
		List<Product> p1 = jdbcTemplate.query("select * from Product1 where price>?" , new Object[] {price}, new BeanPropertyRowMapper<>(Product.class));
		
		return p1;
	}

}
