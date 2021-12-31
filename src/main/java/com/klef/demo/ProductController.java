package com.klef.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController 
{
	@Autowired
	ProductServices pservice;
	
	

	@GetMapping(path="/addproduct")
	public ModelAndView addproduct()
	{
	// emp - request object of type Employee Class
	return new ModelAndView("addproduct","prd",new Product());
	}
	
	
	@PostMapping(path="/submitprd")
	public ModelAndView submitprd(@ModelAttribute("prd") Product prd)
	{
	pservice.addproduct(prd);
	ModelAndView mv = new ModelAndView();
	mv.setViewName("addproductsuccess");
	mv.addObject("pname",prd.getName());
	return mv;
	}
}
