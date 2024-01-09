package com.xxy.lottery.infrastructure.dao;

import com.xxy.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IAwardDao {

    Award queryAwardInfo(String awardId);

}
