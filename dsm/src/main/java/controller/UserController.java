package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
@Autowired
IUserService userService;

	
}
