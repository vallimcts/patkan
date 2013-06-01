package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/article")
public class MovieController {

	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String getArticle(@PathVariable String name, ModelMap model) {

		model.addAttribute("article", name);
		return "list";

	}
	
}