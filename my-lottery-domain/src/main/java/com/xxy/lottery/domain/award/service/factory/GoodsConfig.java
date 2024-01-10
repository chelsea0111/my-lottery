package com.xxy.lottery.domain.award.service.factory;

import com.xxy.lottery.common.Constants;
import com.xxy.lottery.domain.award.service.goods.IDistributionGoods;
import com.xxy.lottery.domain.award.service.goods.impl.CouponGoods;
import com.xxy.lottery.domain.award.service.goods.impl.DescGoods;
import com.xxy.lottery.domain.award.service.goods.impl.PhysicalGoods;
import com.xxy.lottery.domain.award.service.goods.impl.RedeemCodeGoods;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author xuxinyi
 * @create 2024/1/10 22:01
 * @Description
 */
public class GoodsConfig {
    @Resource
    private DescGoods descGoods;

    @Resource
    private RedeemCodeGoods redeemCodeGoods;

    @Resource
    private CouponGoods couponGoods;

    @Resource
    private PhysicalGoods physicalGoods;

    // 奖品发放策略集合
    protected final Map<Integer, IDistributionGoods> goodsMap = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        goodsMap.put(Constants.AwardType.DESC.getCode(), descGoods);
        goodsMap.put(Constants.AwardType.RedeemCodeGoods.getCode(), redeemCodeGoods);
        goodsMap.put(Constants.AwardType.CouponGoods.getCode(), couponGoods);
        goodsMap.put(Constants.AwardType.PhysicalGoods.getCode(), physicalGoods);
    }

}
