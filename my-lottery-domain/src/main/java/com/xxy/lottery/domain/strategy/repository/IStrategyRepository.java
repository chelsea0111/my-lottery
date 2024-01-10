package com.xxy.lottery.domain.strategy.repository;

import com.xxy.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.xxy.lottery.infrastructure.po.Award;

import java.util.List;

public interface IStrategyRepository {
    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);


    /**
     * 扣减库存
     *
     * @param strategyId
     * @param awardId
     * @return 扣减结果
     */
    boolean deductStock(Long strategyId, String awardId);

    /**
     * 查询没有库存的商品列表
     *
     * @param strategyId
     * @return
     */
    List<String> queryNoStockStrategyAwardList(Long strategyId);
}
