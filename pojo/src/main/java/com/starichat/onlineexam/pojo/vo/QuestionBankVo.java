package com.starichat.onlineexam.pojo.vo;


import com.starichat.onlineexam.pojo.Options;
import com.starichat.onlineexam.pojo.QuestionBank;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class QuestionBankVo extends QuestionBank {

	private List<Options> options;

	private boolean ifCorrect;

	public List<Options> getOptions() {
		return options;
	}

	public void setOptions(List<Options> options) {
		this.options = options;
	}

	public boolean isIfCorrect() {
		return ifCorrect;
	}

	public void setIfCorrect(boolean ifCorrect) {
		this.ifCorrect = ifCorrect;
	}

}
