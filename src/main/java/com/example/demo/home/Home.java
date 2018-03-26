package com.example.demo.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {

	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "<h1>Bonjour les amis</h1>";
	}

	/*
	 * En JEE
	 * 
	 * @GetMapping("/test") public String index2(HttpServletRequest req ) {
	 * System.out.println(req).getParam(name); return "index"; }
	 */

	@GetMapping("/test")
	public String index2(@RequestParam(required = false, defaultValue = "defaut") String name, Model model) {
		model.addAttribute("key", name);
		return "index";
	}

}
