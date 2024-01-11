package com.xxy.lottery.domain.activity.model.req;

import com.xxy.lottery.domain.activity.model.aggregates.ActivityConfigRich;
import lombok.*;

/**
 * 活动配置请求对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ActivityConfigReq {
    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 活动配置信息
     */
    private ActivityConfigRich activityConfigRich;
}
