package com.xxy.lottery.domain.award.model.req;

import com.xxy.lottery.domain.award.model.vo.ShippingAddress;
import lombok.*;

/**
 * @Author xuxinyi
 * @create 2024/1/10 21:22
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class GoodsReq {
    /**
     * 用户ID
     */
    private String uId;

    /**
     * 抽奖单号 ID
     */
    private String orderId;

    /**
     * 奖品ID
     */
    private String awardId;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 奖品内容「描述、奖品码、sku」
     */
    private String awardContent;

    /**
     * 四级送货地址（只有实物类商品需要地址）
     */
    private ShippingAddress shippingAddress;

    /**
     * 扩展信息，用于一些个性商品发放所需要的透传字段内容
     */
    private String extInfo;

    public GoodsReq(String uId, String orderId, String awardId, String awardName, String awardContent) {
        this.uId = uId;
        this.orderId = orderId;
        this.awardId = awardId;
        this.awardName = awardName;
        this.awardContent = awardContent;
    }
}
