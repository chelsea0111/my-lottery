package com.xxy.lottery.infrastructure.repository;

import com.xxy.lottery.domain.activity.model.vo.ActivityVO;
import com.xxy.lottery.domain.activity.model.vo.AwardVO;
import com.xxy.lottery.domain.activity.model.vo.StrategyDetailVO;
import com.xxy.lottery.domain.activity.model.vo.StrategyVO;
import com.xxy.lottery.domain.activity.repository.IActivityRepository;
import com.xxy.lottery.infrastructure.dao.IActivityDao;
import com.xxy.lottery.infrastructure.dao.IAwardDao;
import com.xxy.lottery.infrastructure.dao.IStrategyDao;
import com.xxy.lottery.infrastructure.dao.IStrategyDetailDao;
import com.xxy.lottery.infrastructure.po.Activity;
import com.xxy.lottery.infrastructure.po.Award;
import com.xxy.lottery.infrastructure.po.Strategy;
import com.xxy.lottery.infrastructure.po.StrategyDetail;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class ActivityRepository implements IActivityRepository {
    @Resource
    private IActivityDao activityDao;

    @Resource
    private IAwardDao awardDao;

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Override
    public void addActivity(ActivityVO activityVO) {
        Activity activity = new Activity();
        BeanUtils.copyProperties(activityVO, activity);
        activityDao.insert(activity);
    }

    @Override
    public void addAward(List<AwardVO> awardList) {
        ArrayList<Award> list = new ArrayList<>();
        for (AwardVO awardVO : awardList) {
            Award award = new Award();
            BeanUtils.copyProperties(awardVO, award);
            list.add(award);
        }
        awardDao.insertList(list);
    }

    @Override
    public void addStrategy(StrategyVO strategyVO) {
        Strategy strategy = new Strategy();
        BeanUtils.copyProperties(strategyVO, strategy);
        strategyDao.insert(strategy);
    }

    @Override
    public void addStrategyDetailList(List<StrategyDetailVO> strategyDetailList) {
        List<StrategyDetail> req = new ArrayList<>();
        for (StrategyDetailVO strategyDetailVO : strategyDetailList) {
            StrategyDetail strategyDetail = new StrategyDetail();
            BeanUtils.copyProperties(strategyDetailVO, strategyDetail);
            req.add(strategyDetail);
        }
        strategyDetailDao.insertList(req);
    }
}
