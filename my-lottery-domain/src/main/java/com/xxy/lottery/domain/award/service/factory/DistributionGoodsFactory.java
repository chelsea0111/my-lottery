package com.xxy.lottery.domain.award.service.factory;

import com.xxy.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Service;

/**
 * @Author xuxinyi
 * @create 2024/1/10 22:03
 * @Description 简单工厂，根据传入的商品类型，获取具体的商品发放实现类
 */
@Service
public class DistributionGoodsFactory extends GoodsConfig {
    public IDistributionGoods getDistributionGoodsService(Integer awardType) {
        return goodsMap.get(awardType);
    }
}
