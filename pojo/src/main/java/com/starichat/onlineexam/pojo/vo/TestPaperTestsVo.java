package com.starichat.onlineexam.pojo.vo;


import com.starichat.onlineexam.pojo.TestPaperTests;
import org.springframework.stereotype.Component;

@Component
public class TestPaperTestsVo extends TestPaperTests {
	
	private String stem;

	public String getStem() {
		return stem;
	}

	public void setStem(String stem) {
		this.stem = stem;
	}
	
	

}
