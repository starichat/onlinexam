package com.starichat.onlineexam.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public class TestPaperTestsList implements Serializable {

	private Integer testpaperId;

	private List<Integer> questionBankId;

	public Integer getTestpaperId() {
		return testpaperId;
	}

	public void setTestpaperId(Integer testpaperId) {
		this.testpaperId = testpaperId;
	}

	public List<Integer> getQuestionBankId() {
		return questionBankId;
	}

	public void setQuestionBankId(List<Integer> questionBankId) {
		this.questionBankId = questionBankId;
	}

}
