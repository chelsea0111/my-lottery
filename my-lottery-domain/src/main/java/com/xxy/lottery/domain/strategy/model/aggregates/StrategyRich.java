package com.xxy.lottery.domain.strategy.model.aggregates;

import com.xxy.lottery.domain.strategy.model.vo.StrategyBriefVO;
import com.xxy.lottery.domain.strategy.model.vo.StrategyDetailBriefVO;
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
    private Long strategyId;

    /**
     * 策略配置
     */
    private StrategyBriefVO strategy;

    /**
     * 策略明细
     */
    private List<StrategyDetailBriefVO> strategyDetailList;

}
