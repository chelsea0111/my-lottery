package com.xxy.lottery.domain.activity.repository;

import com.xxy.lottery.domain.activity.model.vo.ActivityVO;
import com.xxy.lottery.domain.activity.model.vo.AwardVO;
import com.xxy.lottery.domain.activity.model.vo.StrategyVO;

import java.util.List;

public interface IActivityRepository {
    /**
     * 添加活动配置
     * @param activity
     */
    void addActivity(ActivityVO activity);

    /**
     * 添加奖品配置集合
     * @param awardList
     */
    void addAward(List<AwardVO> awardList);

    /**
     * 添加策略配置
     * @param strategy
     */
    void addStrategy(StrategyVO strategy);
}
