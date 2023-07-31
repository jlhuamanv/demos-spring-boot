package pe.org.jhsystem.demos.server.spring.boot.jmx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pe.org.jhsystem.demos.server.spring.boot.jmx.bean.MyBean;

@Controller
public class MainController {

	@Autowired
	private MyBean myBean;

	@GetMapping("/")
	public ModelAndView main(Model model) {
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("pais", myBean.getPais());
		return mv;
	}
	
	@PostMapping("/result")
	public ModelAndView result(Model model, @RequestParam("cantidad") double cantidad) {
		ModelAndView mv = new ModelAndView("result");
		mv.addObject("resultado", myBean.getResultado(cantidad));
		return mv;
	}
	
}
