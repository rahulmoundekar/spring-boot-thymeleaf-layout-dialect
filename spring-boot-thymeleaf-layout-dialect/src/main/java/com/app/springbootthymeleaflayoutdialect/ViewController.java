package com.app.springbootthymeleaflayoutdialect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping(value = "/")
	public String viewDashboard() {
		return "admin_web/dashboard";
	}

	@RequestMapping(value = "/about")
	public String viewabout() {
		return "admin_web/about";
	}

	@RequestMapping(value = "/contact")
	public String viewContact() {
		return "admin_web/contact";
	}

}
