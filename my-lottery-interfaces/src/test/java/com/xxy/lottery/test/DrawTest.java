package com.xxy.lottery.test;

import com.alibaba.fastjson.JSON;
import com.xxy.lottery.common.Constants;
import com.xxy.lottery.domain.award.model.req.GoodsReq;
import com.xxy.lottery.domain.award.model.res.DistributionRes;
import com.xxy.lottery.domain.award.service.factory.DistributionGoodsFactory;
import com.xxy.lottery.domain.award.service.goods.IDistributionGoods;
import com.xxy.lottery.domain.strategy.model.req.DrawReq;
import com.xxy.lottery.domain.strategy.model.res.DrawResult;
import com.xxy.lottery.domain.strategy.model.vo.DrawAwardInfo;
import com.xxy.lottery.domain.strategy.service.draw.IDrawExec;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DrawTest {

    private Logger logger = LoggerFactory.getLogger(DrawTest.class);

    @Resource
    private IDrawExec drawExec;

    @Resource
    private DistributionGoodsFactory distributionGoodsFactory;

    @Test
    public void test_drawExec() {
        drawExec.doDrawExec(new DrawReq("小傅哥", 10001L));
        drawExec.doDrawExec(new DrawReq("小佳佳", 10001L));
        drawExec.doDrawExec(new DrawReq("小蜗牛", 10001L));
        drawExec.doDrawExec(new DrawReq("八杯水", 10001L));
    }

    /**
     * @author xuxinyi
     * @date 2024/1/10 22:07
     * @description 测试奖品发放
     */
    @Test
    public void test_award() {
        DrawResult drawResult = drawExec.doDrawExec(new DrawReq("123321", 10001L));
        Integer drawState = drawResult.getDrawState();
        if (Constants.DrawState.FAIL.getCode().equals(drawState)) {
            logger.info("未中奖 DrawAwardInfo is null");
            return;
        }

        DrawAwardInfo info = drawResult.getDrawAwardInfo();
        GoodsReq goodsReq = new GoodsReq(drawResult.getUId(), "1704895827", info.getAwardId(), info.getAwardName(), info.getAwardContent());
        IDistributionGoods service = distributionGoodsFactory.getDistributionGoodsService(info.getAwardType());
        DistributionRes distributionRes = service.doDistribution(goodsReq);
        logger.info("奖品发放结果：{}", JSON.toJSONString(distributionRes));
    }
}
