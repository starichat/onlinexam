package com.starichat.onlineexam.service;


import com.starichat.onlineexam.pojo.vo.scoreVo;

import java.util.List;

public interface ScoreService {
    //查询所有考生成绩信息
    List<scoreVo> findUserExamInfo();

}
