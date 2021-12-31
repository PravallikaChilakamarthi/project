package com.klef.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController
{
	@Autowired
	private UserService userService;
	
	@GetMapping(value="/login")
	public String login(Model model) {
		model.addAttribute("user",new User());
		return "login";
	}
	
	@GetMapping(value="/sign")
	public String sign(Model model) {
		model.addAttribute("user",new User());
		return "sign";
	}
	
	
//	@PostMapping("/save")
//	public ModelAndView saveUser(@ModelAttribute("user") User user)
//	{
//		userService.saveUser(user);
//	ModelAndView mv = new ModelAndView();
//	mv.setViewName("successful_reg");
//	mv.addObject("username", user.getFirstName());
//	return mv;
//	}
	
	@PostMapping(path="/save")
	public String saveUser(@ModelAttribute User user,Model model)
	{
		userService.saveUser(user);
		return "successful_reg";
	}
	
	

	@PostMapping(path="/logincheck")
	public String logincheck(@ModelAttribute User user,Model model)
	{
		User cuser=userService.findUserByUserName(user.getUsername());
		
		if(cuser !=null && user.getPassword().equals(cuser.getPassword())) 
		{
			model.addAttribute("message","Welcomee "+cuser.getFirstName());
			return "index"; 
				
		}
		else {
			model.addAttribute("message","Username or password is incorrect");
			return "loginfail";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
