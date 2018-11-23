package com.starichat.onlineexam.service.impl;


import com.starichat.onlineexam.dao.ScoreMapper;
import com.starichat.onlineexam.pojo.vo.scoreVo;
import com.starichat.onlineexam.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {
	
	@Autowired
	private ScoreMapper scoreMapper;
	@Override
	public List<scoreVo> findUserExamInfo() {
		return scoreMapper.findUserExamInfo();
	}

}
