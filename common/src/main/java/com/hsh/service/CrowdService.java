package com.hsh.service;

import java.util.List;

import com.hsh.model.Crowd;
import com.hsh.model.CrowdItem;
import com.hsh.model.CrowdPic;

public interface CrowdService {

    int saveOrUpdateCrowd(Crowd crowd);
	
	int saveOrUpdateItem(CrowdItem item);
	
	int saveOrUpdatePic(CrowdPic crowdPic);
	
	List<CrowdItem> getItemsByCrowdId(int crowdId);
	
	Crowd  getCrowdById(int crowdId);
	
	List<CrowdPic> getPicListByCrowdId(int crowdId);
	
	List<Crowd> getAllCrowdDue();
}
