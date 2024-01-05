package com.xxy.lottery.interfaces;

import com.xxy.lottery.common.Constants;
import com.xxy.lottery.common.Result;
import com.xxy.lottery.infrastructure.dao.IActivityDao;
import com.xxy.lottery.infrastructure.po.Activity;
import com.xxy.lottery.rpc.IActivityBooth;
import com.xxy.lottery.rpc.dto.ActivityDto;
import com.xxy.lottery.rpc.req.ActivityReq;
import com.xxy.lottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class ActivityBooth implements IActivityBooth {

    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {

        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }

}
