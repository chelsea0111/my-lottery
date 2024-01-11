package com.xxy.lottery.domain.activity.service.deploy;

import com.xxy.lottery.domain.activity.model.req.ActivityConfigReq;

/**
 * 部署活动配置接口
 */
public interface IActivityDeploy {
    /**
     * @author xuxinyi
     * @date 2024/1/11 22:10
     * @description 创建活动信息
     */
    void createActivity(ActivityConfigReq req);

    /**
     * @author xuxinyi
     * @date 2024/1/11 22:10
     * @description 修改活动信息
     */
    void updateActivity(ActivityConfigReq req);
}
