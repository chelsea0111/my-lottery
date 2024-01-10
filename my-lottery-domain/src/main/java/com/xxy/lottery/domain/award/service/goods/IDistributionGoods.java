package com.xxy.lottery.domain.award.service.goods;

import com.xxy.lottery.domain.award.model.req.GoodsReq;
import com.xxy.lottery.domain.award.model.res.DistributionRes;

/**
 * 奖品发放接口
 */
public interface IDistributionGoods {

    /**
     * @param req 物品信息
     * @return 配送结果
     * @author xuxinyi
     * @date 2024/1/10 21:57
     * @description 奖品配送接口，奖品类型（1:文字描述、2:兑换码、3:优惠券、4:实物奖品）
     */
    DistributionRes doDistribution(GoodsReq req);

    Integer getDistributionGoodsName();
}
