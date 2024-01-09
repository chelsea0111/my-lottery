package com.xxy.lottery.domain.strategy.service.draw;

import com.xxy.lottery.domain.strategy.model.req.DrawReq;
import com.xxy.lottery.domain.strategy.model.res.DrawResult;
/**
 * @author xuxinyi
 * @date 2024/1/9 23:21
 * @description 抽奖策略的使用
*/

public interface IDrawExec {
    DrawResult doDrawExec(DrawReq req);

}