package com.starichat.onlineexam.service.impl;


import com.starichat.onlineexam.dao.QuestionBankMapper;
import com.starichat.onlineexam.dao.TestPaperMapper;
import com.starichat.onlineexam.pojo.TestPaper;
import com.starichat.onlineexam.pojo.vo.QuestionBankVo;
import com.starichat.onlineexam.service.TestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestPaperServiceImpl implements TestPaperService {
	@Autowired
	private TestPaperMapper testPaperMapper;
	@Autowired
	private QuestionBankMapper questionBankMapper; //题库

	@Override
	public List<TestPaper> findTestPaperInfo() {

		return testPaperMapper.findTestPaperInfo();
	}

	@Override
	public int updateTestPaperState(int testpaperId) {
		// TODO Auto-generated method stub
		return testPaperMapper.updateTestPaperState(testpaperId);
	}

	@Override
	public TestPaper selectByPrimaryKey(Integer testpaperId) {
		// TODO Auto-generated method stub
		return testPaperMapper.selectByPrimaryKey(testpaperId);
	}

	@Override
	public int updateTestPaperInfo(TestPaper testPaper) {
		// TODO Auto-generated method stub
		return testPaperMapper.updateTestPaperInfo(testPaper);
	}

	@Override
	public List<QuestionBankVo> findAllQuestionBank() {
		
		List<QuestionBankVo> findAllQuestionBank = questionBankMapper.findAllQuestionBank();
		
		return findAllQuestionBank;
	}


}
