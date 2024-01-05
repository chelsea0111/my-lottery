package com.xxy.lottery.rpc;

import com.xxy.lottery.rpc.req.ActivityReq;
import com.xxy.lottery.rpc.res.ActivityRes;

public interface IActivityBooth {
    ActivityRes queryActivityById(ActivityReq req);
}
