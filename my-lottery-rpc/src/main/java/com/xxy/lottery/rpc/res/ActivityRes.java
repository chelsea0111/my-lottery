package com.xxy.lottery.rpc.res;

import com.xxy.lottery.common.Result;
import com.xxy.lottery.rpc.dto.ActivityDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityRes implements Serializable {

    private Result result;
    private ActivityDto activity;
}
