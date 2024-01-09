package com.xxy.lottery.domain.strategy.service.draw;

import com.xxy.lottery.domain.strategy.model.req.DrawReq;
import com.xxy.lottery.domain.strategy.model.res.DrawResult;

public interface IDrawExec {

    DrawResult doDrawExec(DrawReq req);

}