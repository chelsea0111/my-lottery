package com.xxy.lottery.domain.activity.service.stateflow.impl;

import com.xxy.lottery.common.Constants;
import com.xxy.lottery.common.Result;
import com.xxy.lottery.domain.activity.service.stateflow.AbstractState;
import org.springframework.stereotype.Component;

/**
 * 提审状态
 */
@Component
public class ArraignmentState extends AbstractState {
    @Override
    public Result arraignment(Long activityId, Enum<Constants.ActivityState> currentState) {
        return Result.buildResult(Constants.ResponseCode.UN_ERROR.getCode(), "待审核状态不可重复提审");
    }

    @Override
    public Result checkPass(Long activityId, Enum<Constants.ActivityState> currentState) {
        return null;
    }

    @Override
    public Result checkRefuse(Long activityId, Enum<Constants.ActivityState> currentState) {
        return null;
    }

    @Override
    public Result checkRevoke(Long activityId, Enum<Constants.ActivityState> currentState) {
        return null;
    }

    @Override
    public Result close(Long activityId, Enum<Constants.ActivityState> currentState) {
        return null;
    }

    @Override
    public Result open(Long activityId, Enum<Constants.ActivityState> currentState) {
        return null;
    }

    @Override
    public Result doing(Long activityId, Enum<Constants.ActivityState> currentState) {
        return null;
    }
}
