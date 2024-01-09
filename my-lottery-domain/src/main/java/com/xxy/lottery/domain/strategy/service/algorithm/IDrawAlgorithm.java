package com.xxy.lottery.domain.strategy.service.algorithm;

import com.xxy.lottery.domain.strategy.model.vo.AwardRateInfo;

import java.util.List;

/**
 * 抽奖算法接口
 */
public interface IDrawAlgorithm {
    /**
     * SecureRandom 生成随机数，索引到对应的奖品信息返回结果
     *
     * @param strategyId      策略ID
     * @param excludeAwardIds 排除掉已经不能作为抽奖的奖品ID，留给风控和空库存使用
     * @return 抽奖结果
     */
    String randomDraw(Long strategyId, List<String> excludeAwardIds);

    /**
     * 判断是否已经，做了数据初始化
     *
     * @param strategyId
     * @return
     */
    boolean isExistRateTuple(Long strategyId);

    /**
     * 程序启动时初始化概率元祖，在初始化完成后使用过程中不允许修改元祖数据
     *
     * @param strategyId        策略ID
     * @param awardRateInfoList 奖品概率配置集合 示例：AwardRateInfo.awardRate = 0.04
     */
    void initRateTuple(Long strategyId, List<AwardRateInfo> awardRateInfoList);
}
