package com.xxy.lottery.test.domain;

import com.alibaba.fastjson.JSON;
import com.xxy.lottery.common.Constants;
import com.xxy.lottery.domain.activity.model.aggregates.ActivityConfigRich;
import com.xxy.lottery.domain.activity.model.req.ActivityConfigReq;
import com.xxy.lottery.domain.activity.model.vo.ActivityVO;
import com.xxy.lottery.domain.activity.model.vo.AwardVO;
import com.xxy.lottery.domain.activity.model.vo.StrategyDetailVO;
import com.xxy.lottery.domain.activity.model.vo.StrategyVO;
import com.xxy.lottery.domain.activity.service.deploy.IActivityDeploy;
import com.xxy.lottery.domain.activity.service.stateflow.IStateHandler;
import com.xxy.lottery.domain.support.ids.IIdGenerator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SupportTest {
    private Logger logger = LoggerFactory.getLogger(SupportTest.class);

    @Resource
    private Map<Constants.Ids, IIdGenerator> idGeneratorMap;

    @Test
    public void test_ids() {
        logger.info("{}", idGeneratorMap.get(Constants.Ids.SnowFlake).nextId());
        logger.info("{}", idGeneratorMap.get(Constants.Ids.ShortCode).nextId());
        logger.info("{}", idGeneratorMap.get(Constants.Ids.RandomNumeric).nextId());
    }
}
