package com.xxy.lottery.domain.strategy.service.draw.impl;

import com.xxy.lottery.domain.strategy.service.algorithm.IDrawAlgorithm;
import com.xxy.lottery.domain.strategy.service.draw.AbstractDrawBase;
import org.slf4j.Logger;
import com.alibaba.fastjson.JSON;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("drawExec")
public class DrawExecImpl extends AbstractDrawBase {
    private Logger logger = LoggerFactory.getLogger(DrawExecImpl.class);

    @Override
    protected String drawAlgorithm(Long strategyId, IDrawAlgorithm drawAlgorithm, List<String> excludeAwardIds) {
        String awardId = drawAlgorithm.randomDraw(strategyId, excludeAwardIds);

        if (null == awardId) {
            return null;
        }
        boolean isSuccess = strategyRepository.deductStock(strategyId, awardId);
        return isSuccess ? awardId : null;
    }

    @Override
    protected List<String> queryExcludeAwardIds(Long strategyId) {
        List<String> awardIds = strategyRepository.queryNoStockStrategyAwardList(strategyId);
        logger.info("执行抽奖策略 strategyId：{}，无库存排除奖品列表ID集合 awardList：{}", strategyId, JSON.toJSONString(awardIds));
        return awardIds;
    }
}
