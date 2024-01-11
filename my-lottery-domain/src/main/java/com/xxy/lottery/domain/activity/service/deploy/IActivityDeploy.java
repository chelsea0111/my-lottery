package com.xxy.lottery.domain.activity.service.deploy;

import com.xxy.lottery.domain.activity.model.req.ActivityConfigReq;

/**
 * 部署活动配置接口
 */
public interface IActivityDeploy {
    void createActivity(ActivityConfigReq req);
}
