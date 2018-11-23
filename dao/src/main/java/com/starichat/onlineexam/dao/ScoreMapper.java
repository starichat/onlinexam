package com.starichat.onlineexam.dao;


import com.starichat.onlineexam.pojo.Score;
import com.starichat.onlineexam.pojo.vo.scoreVo;

import java.util.List;

public interface ScoreMapper {
    int deleteByPrimaryKey(Integer scoreId);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer scoreId);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
    
    //查询所有考生成绩信息
    List<scoreVo> findUserExamInfo();
    
}