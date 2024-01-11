package com.xxy.lottery.infrastructure.dao;

import com.xxy.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IAwardDao {

    Award queryAwardInfo(String awardId);

    void insertList(@Param("list") List<Award> list);

}
