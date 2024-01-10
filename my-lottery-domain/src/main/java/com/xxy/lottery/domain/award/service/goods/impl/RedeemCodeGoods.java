package com.xxy.lottery.domain.award.service.goods.impl;

import com.xxy.lottery.common.Constants;
import com.xxy.lottery.domain.award.model.req.GoodsReq;
import com.xxy.lottery.domain.award.model.res.DistributionRes;
import com.xxy.lottery.domain.award.service.goods.DistributionBase;
import com.xxy.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;

/**
 * @author xuxinyi
 * @date 2024/1/10 21:59
 * @description 兑换码类商品
 */
@Component
public class RedeemCodeGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        // 模拟调用兑换码
        logger.info("模拟调用兑换码 uId：{} awardContent：{}", req.getUId(), req.getAwardContent());

        // 更新用户领奖结果
        super.updateUserAwardState(req.getUId(), req.getOrderId(), req.getAwardId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());

        return new DistributionRes(req.getUId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

    @Override
    public Integer getDistributionGoodsName() {
        return Constants.AwardType.RedeemCodeGoods.getCode();
    }

}