

package com.klef.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	
	@Autowired
	EmployeeService empservice;
	ProductServices pservice;
	
	@GetMapping("/adminhome")
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("adminhome");
		return mv;
	}
	
	
	@GetMapping("/addemployee")
	public ModelAndView addemployee()
	{
	// emp - request object of type Employee Class
	return new ModelAndView("addemployee","emp",new Employee());
	}
	
	
	@PostMapping("/submitemp")
	public ModelAndView submitempdata(@ModelAttribute("emp") Employee emp)
	{
	empservice.addemployeerecord(emp);
	ModelAndView mv = new ModelAndView();
	mv.setViewName("addsuccess");
	mv.addObject("empname", emp.getEmpname());
	return mv;
	}
	
	@GetMapping("/viewallemployees")
	public ModelAndView viewallemployees()
	{
		//HttpSession ssion =re
		List<Employee> employees =empservice.getallemployeerecords();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("viewallemployees");
		mv.addObject("empdata",employees);
		return mv;
	}
	
	
	@GetMapping("/employee/delete/{empid}")
	public String deleteemployeerecord(@PathVariable("empid")int empid)
	{
		empservice.deleteemployeerecord(empid);
		return "redirect:/viewallemployees";
		
		
	}
	
	
}
