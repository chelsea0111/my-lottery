package com.xxy.lottery.domain.strategy.repository.impl;

import com.xxy.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.xxy.lottery.domain.strategy.repository.IStrategyRepository;
import com.xxy.lottery.infrastructure.dao.IAwardDao;
import com.xxy.lottery.infrastructure.dao.IStrategyDao;
import com.xxy.lottery.infrastructure.dao.IStrategyDetailDao;
import com.xxy.lottery.infrastructure.po.Award;
import com.xxy.lottery.infrastructure.po.Strategy;
import com.xxy.lottery.infrastructure.po.StrategyDetail;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author xuxinyi
 * @create 2024/1/10 00:20
 * @Description
 */
public class StrategyRepository implements IStrategyRepository {
    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Resource
    private IAwardDao awardDao;

    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        Strategy strategy = strategyDao.queryStrategy(strategyId);
        List<StrategyDetail> strategyDetails = strategyDetailDao.queryStrategyDetailList(strategyId);
        return new StrategyRich(strategyId, strategy, strategyDetails);
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return awardDao.queryAwardInfo(awardId);
    }
}
