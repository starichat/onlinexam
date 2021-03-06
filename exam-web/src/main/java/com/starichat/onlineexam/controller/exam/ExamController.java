package com.starichat.onlineexam.controller.exam;


import com.starichat.onlineexam.pojo.TestPaper;
import com.starichat.onlineexam.pojo.vo.QuestionBankVo;
import com.starichat.onlineexam.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/exam")
public class ExamController {
	
	@Autowired
	private ExamService examService;

	/**
	 * 试卷模板映射
	 * @return
	 */
	@RequestMapping(value = "/index.html", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		
		List<TestPaper> allTestPaper = examService.findAllTestPaper();
		modelAndView.addObject("allTestPaper", allTestPaper);
		
		modelAndView.setViewName("_exam/index");
		return modelAndView;
	}
	
	/**
	 * 试卷模板映射
	 * @return
	 */
	@RequestMapping(value = "/exam-{id}.html", method = RequestMethod.GET)
	public ModelAndView exam(@PathVariable String id, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		examService.findJudgmentQuestionAndChoiceQuestion(modelAndView, id, session);

    	List<TestPaper> allTestPaper = examService.findAllTestPaper();
		modelAndView.addObject("allTestPaper", allTestPaper);

		
		return modelAndView;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/submitpapers", method = RequestMethod.POST)
	public List<QuestionBankVo> submitPapers(@RequestBody List<QuestionBankVo> questionBankVos, HttpSession session) {
		
		List<QuestionBankVo> judgmentSystem = examService.JudgmentSystem(questionBankVos, session);
		
		return judgmentSystem;
	}
	
	/**
	 * 试卷模板映射
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/autoGenerate", method = RequestMethod.POST)
	public boolean autoGenerate(HttpSession session, TestPaper testPaper) {
		
		boolean autoGenerate = examService.autoGenerate(session, testPaper.getTestpaperId());
		
		return autoGenerate;
	}
	
}
