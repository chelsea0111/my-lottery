package com.xxy.lottery.rpc;

import com.xxy.lottery.rpc.req.ActivityReq;
import com.xxy.lottery.rpc.res.ActivityRes;

/**
 * @author xuxinyi
 * @date 2024/1/8 23:46
 * @description 提供给外部的接口描述
*/
public interface IActivityBooth {
    ActivityRes queryActivityById(ActivityReq req);
}
