


package com.nkdebug;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("add");
		
		int n1 = Integer.parseInt(request.getParameter("t1"));
		int n2 = Integer.parseInt(request.getParameter("t2"));
		
		int sum = n1+n2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome.jsp");
		mv.addObject("sum", sum);
		
		return mv;
		
	}
}
