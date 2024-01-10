package com.xxy.lottery.domain.award.service.goods.impl;

import com.xxy.lottery.common.Constants;
import com.xxy.lottery.domain.award.model.req.GoodsReq;
import com.xxy.lottery.domain.award.model.res.DistributionRes;
import com.xxy.lottery.domain.award.service.goods.DistributionBase;
import com.xxy.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;

/**
 * @author xuxinyi
 * @date 2024/1/10 21:58
 * @description 描述类商品，以文字形式展示给用户
 */
@Component
public class DescGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        super.updateUserAwardState(req.getUId(), req.getOrderId(), req.getAwardId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());

        return new DistributionRes(req.getUId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

    @Override
    public Integer getDistributionGoodsName() {
        return Constants.AwardType.DESC.getCode();
    }

}