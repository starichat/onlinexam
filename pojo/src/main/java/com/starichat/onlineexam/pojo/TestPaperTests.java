package com.starichat.onlineexam.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class TestPaperTests implements Serializable {
    private Integer testpaperTestsId;

    private Integer testpaperId;

    private Integer questionBankId;

    public Integer getTestpaperTestsId() {
        return testpaperTestsId;
    }

    public void setTestpaperTestsId(Integer testpaperTestsId) {
        this.testpaperTestsId = testpaperTestsId;
    }

    public Integer getTestpaperId() {
        return testpaperId;
    }

    public void setTestpaperId(Integer testpaperId) {
        this.testpaperId = testpaperId;
    }

    public Integer getQuestionBankId() {
        return questionBankId;
    }

    public void setQuestionBankId(Integer questionBankId) {
        this.questionBankId = questionBankId;
    }

	@Override
	public String toString() {
		return "TestPaperTests [testpaperTestsId=" + testpaperTestsId + ", testpaperId=" + testpaperId
				+ ", questionBankId=" + questionBankId + "]";
	}
    
    
}