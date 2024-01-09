package com.xxy.lottery.domain.strategy.model.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DrawReq {
    // 用户ID
    private String uId;

    // 策略ID
    private Long strategyId;
}
