package com.xxy.lottery.domain.strategy.model.aggregates;

import com.xxy.lottery.infrastructure.po.Strategy;
import com.xxy.lottery.infrastructure.po.StrategyDetail;
import lombok.*;

import java.util.List;

/**
 * @Author xuxinyi
 * @create 2024/1/9 23:27
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class StrategyRich {
    // 策略ID
    private Long strategyId;
    // 策略配置
    private Strategy strategy;
    // 策略明细
    private List<StrategyDetail> strategyDetailList;

}
