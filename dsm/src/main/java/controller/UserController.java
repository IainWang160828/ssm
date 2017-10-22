package controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONObject;

import dto.UserLoginReq;
import dto.UserLoginResp;
import dto.UserRegisterReq;
import dto.UserRegisterResp;
import service.IUserRegister;
import service.IUserService;

@Controller
@RequestMapping("/dsm")
public class UserController {
@Autowired
IUserService userService;

@Autowired
IUserRegister userRegister;
@RequestMapping(value="/login", method = RequestMethod.POST)//登陆
public String login(@RequestParam("username")String username, @RequestParam("password")String password){
	final Logger logger = LoggerFactory.getLogger("UserController");
	UserLoginReq req= new UserLoginReq();
	req.setUsername(username);
	req.setPassword(password);
	UserLoginResp resp= userService.loginByUsernameAndPassword(req);
	if (resp.getUsername()!=null){
		logger.info("===========>用户"+resp.getUsername()+"已登录！");
		logger.info("===========>用户等级"+resp.getUserRole()+resp.getUserRoleDesc());
	return "redirect:/jsp/LoginSuccess.jsp";
	}
	else{
		logger.info("===========>用户"+resp.getUsername()+"登录失败！");
		logger.info("===========>用户等级"+resp.getUserRole()+resp.getUserRoleDesc());
		return "redirect:/jsp/LoginFail.jsp";
	}
}

	@RequestMapping(value = "/register", method = RequestMethod.POST) // 注册
	public String register(@RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam("telephone") String telephone, @RequestParam("company") String company,
			@RequestParam("age") String age, @RequestParam("email") String email) {
      
		final Logger logger = LoggerFactory.getLogger("UserController");
		UserRegisterReq req= new UserRegisterReq();
		req.setAge(age);
		req.setCompany(company);
		req.setEmail(email);
		req.setPassword(password);
		req.setTelephone(telephone);
		req.setUsername(username);
		UserRegisterResp resp= userRegister.registerNewUser(req);
		if(resp.getUserId()!=null){
			logger.info(resp.getUserId());
			logger.info(resp.getRegisterDesc());
			return "redirect:/jsp/RegisterSuccess.jsp";
		}
		else{
			
			logger.info(resp.getRegisterDesc());
			return "redirect:/jsp/RegisterFail.jsp";
		}
		
	}

	
}
