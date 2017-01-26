package ahundia.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";

	}

	@RequestMapping(value = "/index/{name:.+}", method = RequestMethod.GET)
	public ModelAndView index(@PathVariable("name") String name) {

		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		model.addObject("msg", name);

		return model;

	}
	 @RequestMapping(value = "/robots.txt", method = RequestMethod.GET)
	    public String getRobots(HttpServletRequest request) {
	        return "robotsAllowed" ;
	    }

}