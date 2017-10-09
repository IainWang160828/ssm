package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dto.UserLoginReq;
import dto.UserLoginResp;
import service.IUserService;

@Controller
@RequestMapping("/dsm")
public class UserController {
@Autowired
IUserService userService;
@RequestMapping(value="/jsp/user/login", method = RequestMethod.POST)
public String login(@RequestParam("username")String username, @RequestParam("password")String password,Model model){
	UserLoginReq req= new UserLoginReq();
	req.setUsername(username);
	req.setPassword(password);
	UserLoginResp resp= userService.loginByUsernameAndPassword(req);
	if (resp.getUsername()!=null){
	model.addAttribute("username", username);	
	return "success";
	
	}
	else{
	return "fail";
	}
}

	
}
