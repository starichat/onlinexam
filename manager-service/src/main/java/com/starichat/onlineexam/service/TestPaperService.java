package com.starichat.onlineexam.service;


import com.starichat.onlineexam.pojo.TestPaper;
import com.starichat.onlineexam.pojo.vo.QuestionBankVo;

import java.util.List;

public interface TestPaperService {
    //查询所有有效试卷
    List<TestPaper> findTestPaperInfo();
    //更改试卷状态
    int updateTestPaperState(int testpaperId);
    //根据id查询试卷信息
    TestPaper selectByPrimaryKey(Integer testpaperId);
    
    //编辑试卷信息
    int updateTestPaperInfo(TestPaper testPaper);
    
    //查询所有题库
  	public List<QuestionBankVo> findAllQuestionBank();
}
