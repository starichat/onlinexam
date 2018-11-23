package com.starichat.onlineexam.service;


import com.starichat.onlineexam.pojo.TestPaperTestsList;
import com.starichat.onlineexam.pojo.vo.TestPaperTestsVo;

import java.util.List;

public interface TestPaperTestService {
	
    //根据试卷id查询试卷试题
 
    List<TestPaperTestsVo> findSelectTestPaperQuesion(int testpaperId);
    //根据试卷id删除试卷试题表信息
    
    int deleteTestPaperTestById(int testpaperId);
    
    //添加试卷试题
    
    int addTestPaperQuestion(TestPaperTestsList testPaperTestsList);

}
