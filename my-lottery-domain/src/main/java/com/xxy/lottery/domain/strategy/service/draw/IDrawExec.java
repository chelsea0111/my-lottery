package com.xxy.lottery.domain.strategy.service.draw;

import com.xxy.lottery.domain.strategy.model.req.DrawReq;
import com.xxy.lottery.domain.strategy.model.res.DrawResult;

/**
 * @author xuxinyi
 * @date 2024/1/9 23:21
 * @description 抽奖执行接口
 */

public interface IDrawExec {
    /**
     * 抽奖方法
     *
     * @param req 用户ID、策略ID
     * @return 中奖结果
     */
    DrawResult doDrawExec(DrawReq req);

}