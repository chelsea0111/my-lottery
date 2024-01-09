package com.xxy.lottery.domain.strategy.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 奖品概率信息，奖品编号、库存、概率
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AwardRateInfo {

    // 奖品ID
    private String awardId;

    // 中奖概率
    private BigDecimal awardRate;
}
