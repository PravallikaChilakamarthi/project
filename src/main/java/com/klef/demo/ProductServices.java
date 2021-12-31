package com.klef.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServices
{
	@Autowired
	ProductRepository prepository;
	
	public void addproduct(Product prd)
	{
		prepository.save(prd);
	}
	
	public List<Product> getallproducts()
	{
		return (List<Product>)prepository.findAll();
	}
	
	public void deleteproduct(int pid)
	{
		prepository.deleteById(pid);
	}

}
