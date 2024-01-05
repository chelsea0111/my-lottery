package com.xxy.lottery.rpc.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityReq implements Serializable {
    private Long activityId;
}
