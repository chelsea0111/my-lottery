package com.xxy.lottery.infrastructure.dao;

import com.xxy.lottery.infrastructure.po.StrategyDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack)
 */
@Mapper
public interface IStrategyDetailDao {

    List<StrategyDetail> queryStrategyDetailList(Long strategyId);

    int deductStock(StrategyDetail strategyDetail);

    List<String> queryNoStockStrategyAwardList(Long strategyId);

    void insertList(List<StrategyDetail> req);
}
