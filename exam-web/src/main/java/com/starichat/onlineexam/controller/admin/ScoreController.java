package com.starichat.onlineexam.controller.admin;


import com.starichat.onlineexam.pojo.vo.scoreVo;
import com.starichat.onlineexam.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class ScoreController {
	
	@Autowired
	private ScoreService scoreService;
	
	@RequestMapping(value="/score.html",method = RequestMethod.GET)
	public ModelAndView findUserExamInfo(){
		List<scoreVo> listScore=scoreService.findUserExamInfo();
		System.out.println("---------------------");
		System.out.println(listScore);
		System.out.println("---------------------");
		ModelAndView modelAndView = new ModelAndView();
    	modelAndView.addObject("listScore", listScore);
    	modelAndView.setViewName("_admin/score"); 
		return modelAndView;
	}

}
