package com.xxy.lottery.domain.strategy.service.draw;

import com.xxy.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.xxy.lottery.domain.strategy.repository.IStrategyRepository;
import com.xxy.lottery.infrastructure.po.Award;

import javax.annotation.Resource;

/**
 * @Author xuxinyi
 * @create 2024/1/10 00:49
 * @Description 抽奖支撑类 提供一些数据服务
 */
public class DrawStrategySupport extends DrawConfig{
    @Resource
    protected IStrategyRepository strategyRepository;

    /**
     * @author xuxinyi
     * @date 2024/1/10 00:56
     * @description 查询策略配置信息
     * @param strategyId
     * @return
    */
    protected StrategyRich queryStrategyRich(Long strategyId){
        return strategyRepository.queryStrategyRich(strategyId);
    }

    /**
     * @author xuxinyi
     * @date 2024/1/10 00:57
     * @description 查询奖品详情信息
     * @param awardId
     * @return com.xxy.lottery.infrastructure.po.Award
    */
    protected Award queryAwardInfoByAwardId(String awardId){
        return strategyRepository.queryAwardInfo(awardId);
    }

}
