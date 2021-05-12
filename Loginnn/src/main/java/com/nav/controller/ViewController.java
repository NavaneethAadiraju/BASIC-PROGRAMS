package com.nav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nav.model.User;
import com.nav.service.UserService;

import javax.validation.Valid;

@Controller
public class ViewController {

	@Autowired
	UserService userService;
	@Autowired
	User user;

	@GetMapping(path = { "/", "/login" })
	public ModelAndView loginPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login.html");
		return modelAndView;
	}

	@GetMapping(path = "/register")
	public ModelAndView registrationPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("register.html");
		return modelAndView;
	}

	@PostMapping(path = "/register")
	public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult, RedirectAttributes ra) {
		ModelAndView modelAndView = new ModelAndView();
		User userExists = userService.findUserByEmail(user.getEmail());
		if (userExists != null) {
			bindingResult.rejectValue("email", "error.user", "There is already a user registered with this Email");
		}
		if (!user.getPassword().equals(user.getConfirmPassword())) {
			bindingResult.rejectValue("confirmPassword", "error.user", "Password did not matched");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("register.html");

		} else {
			userService.saveUser(user);
			ra.addFlashAttribute("successMessage", "User has been registered successfully");
			return new ModelAndView("redirect:/login");

		}
		return modelAndView;
	}

	@GetMapping(path = "/home")
	public ModelAndView homePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/home.html");
		return modelAndView;
	}
}
