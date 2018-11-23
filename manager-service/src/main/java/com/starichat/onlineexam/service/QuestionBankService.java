package com.starichat.onlineexam.service;


import com.github.pagehelper.PageInfo;
import com.starichat.onlineexam.pojo.vo.QuestionBankVo;

/**
 * 题库业务类
 */
public interface QuestionBankService {

	//查询所有试题
	PageInfo<QuestionBankVo> findAllQuestionBank(PageInfo<QuestionBankVo> pageInfo);
	
	//添加题
	boolean addQuestionBank(QuestionBankVo questionBankVo);

	//删除题目
	boolean deleteQuestionBank(String questionBankId);
	
	//更新题目
	boolean updateQuestionBank(QuestionBankVo questionBankVo);
	
}
