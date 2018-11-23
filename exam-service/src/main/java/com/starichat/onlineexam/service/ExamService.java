package com.starichat.onlineexam.service;


import com.starichat.onlineexam.pojo.TestPaper;
import com.starichat.onlineexam.pojo.vo.QuestionBankVo;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface ExamService {

	//查询所有开始考试试卷到前端
	public List<TestPaper> findAllTestPaper();
	
	//查询选择判断题
	public void findJudgmentQuestionAndChoiceQuestion(ModelAndView modelAndView, String id, HttpSession session);

	//判题系统
	public List<QuestionBankVo> JudgmentSystem(List<QuestionBankVo> questionBankVos, HttpSession session);

	public boolean autoGenerate(HttpSession session, Integer id);

	
}
