package com.xxy.lottery.domain.strategy.service.draw;

import com.xxy.lottery.domain.strategy.model.req.DrawReq;
import com.xxy.lottery.domain.strategy.model.res.DrawResult;
/**
 * @author xuxinyi
 * @date 2024/1/9 23:21
 * @description 抽奖执行接口
*/

public interface IDrawExec {
    DrawResult doDrawExec(DrawReq req);

}