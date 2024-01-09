package com.xxy.lottery.domain.strategy.repository;

import com.xxy.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.xxy.lottery.infrastructure.po.Award;

public interface IStrategyRepository {
    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);
}
