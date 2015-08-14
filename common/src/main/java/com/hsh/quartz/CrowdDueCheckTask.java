package com.hsh.quartz;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hsh.model.Crowd;
import com.hsh.service.CrowdService;
import com.hsh.service.UserCrowdService;

/**
 * 每日凌晨0时执行，检查于昨日到期的项目，对参与支持资金本金退还至钱包，并发放惠生活充值卷
 * 惠生活充值卷发放时间如果，项目成功时，用户投资已满指定天数，则立刻发放，如果不满指定天数，则按
 * 实际支持天数按比例获得部分金额的购物卷
 * @author linianf
 *
 */
public class CrowdDueCheckTask {
	
    @Autowired
    private CrowdService crowdService;
    
    @Autowired
    private UserCrowdService userCrowdService;

	private static Logger log = LoggerFactory.getLogger(CrowdDueCheckTask.class);
	
	public void crowdDueCheck(){
		log.info("开始检查是否有于昨日到期的项目");
		//所有到期未结算的项目
		List<Crowd> crowdList = crowdService.getAllCrowdDue();
		for(Crowd crowd:crowdList){
			List<UserCrowd> userCrowdList = userCrowdService.getInCrowdList(100, 0);
			
		}
		
	}
}
