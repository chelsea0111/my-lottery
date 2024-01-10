package com.xxy.lottery.domain.award.model.res;

import lombok.*;

/**
 * @Author xuxinyi
 * @create 2024/1/10 21:20
 * @Description 商品发放结果
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class DistributionRes {
    /**
     * 用户ID
     */
    private String uId;

    /**
     * 编码
     */
    private Integer code;
    /**
     * 描述
     */
    private String info;

    /**
     * 结算单ID，如：发券后有券码、发货后有单号等，用于存根查询
     */
    private String statementId;

    public DistributionRes(String uId, Integer code, String info) {
        this.uId = uId;
        this.code = code;
        this.info = info;
    }
}
