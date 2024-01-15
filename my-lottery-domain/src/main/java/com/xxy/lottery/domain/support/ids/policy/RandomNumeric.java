package com.xxy.lottery.domain.support.ids.policy;

import com.xxy.lottery.domain.support.ids.IIdGenerator;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

/**
 * 随机算法，短码，大量，全局唯一需要自己保证
 * 工具类生成 org.apache.commons.lang3.RandomStringUtils
 */
@Component
public class RandomNumeric implements IIdGenerator {

    @Override
    public long nextId() {
        return Long.parseLong(RandomStringUtils.randomNumeric(11));
    }

}
