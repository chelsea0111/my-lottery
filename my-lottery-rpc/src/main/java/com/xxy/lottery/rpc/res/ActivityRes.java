package com.xxy.lottery.rpc.res;

import com.xxy.lottery.common.Result;
import com.xxy.lottery.rpc.dto.ActivityDto;

import java.io.Serializable;


public class ActivityRes implements Serializable {

    private Result result;
    private ActivityDto activity;

    public ActivityRes(Result result) {
        this.result = result;
    }

    public ActivityRes(Result result, ActivityDto activity) {
        this.result = result;
        this.activity = activity;
    }
}
