package com.starichat.onlineexam.service.impl;


import com.starichat.onlineexam.dao.TestPaperTestsMapper;
import com.starichat.onlineexam.pojo.TestPaperTests;
import com.starichat.onlineexam.pojo.TestPaperTestsList;
import com.starichat.onlineexam.pojo.vo.TestPaperTestsVo;
import com.starichat.onlineexam.service.TestPaperTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestPaperTestServiceImpl implements TestPaperTestService {
	
	@Autowired
	private TestPaperTestsMapper testPaperTestsMapper;

	@Override
	public List<TestPaperTestsVo> findSelectTestPaperQuesion(int testpaperId) {
		// TODO Auto-generated method stub
		return testPaperTestsMapper.findSelectTestPaperQuesion(testpaperId);
	}

	@Override
	public int deleteTestPaperTestById(int testpaperId) {
		// TODO Auto-generated method stub
		return testPaperTestsMapper.deleteTestPaperTestById(testpaperId);
	}

	@Override
	public int addTestPaperQuestion(TestPaperTestsList testPaperTestsList) {
		
		List<TestPaperTests> testPaperTests = new ArrayList<TestPaperTests>();
		
		for (Integer id : testPaperTestsList.getQuestionBankId()) {
			TestPaperTests temp = new TestPaperTests();
			temp.setQuestionBankId(id);
			temp.setTestpaperId(testPaperTestsList.getTestpaperId());
			testPaperTests.add(temp);
		}
		
		return testPaperTestsMapper.addTestPaperQuestion(testPaperTests);
	}

}
