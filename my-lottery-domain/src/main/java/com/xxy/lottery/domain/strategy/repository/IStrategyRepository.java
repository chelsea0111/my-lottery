package com.xxy.lottery.domain.strategy.repository;

public interface IStrategyRepository {
    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);
}
