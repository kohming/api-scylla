package com.scylla.api.scyllaapi.controller;

import com.scylla.api.scyllaapi.models.AuditMasters;
import com.scylla.api.scyllaapi.service.SvComboService;
import com.scylla.api.scyllaapi.service.SvMblGroupOutService;
import com.scylla.api.scyllaapi.service.SvMblService;
import com.scylla.api.scyllaapi.service.SvMblTypeOutService;
import com.scylla.api.scyllaapi.service.SvSurveyTypeAnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditController {
	
	@Autowired
	SvComboService comboService;
	
	@Autowired
	SvSurveyTypeAnsService surveyTypeAnsService;
	
	@Autowired
	SvMblService mobileService;
	
	@Autowired
	SvMblTypeOutService typeOutletService;
	
	@Autowired
	SvMblGroupOutService groupOutletService;
	
	@RequestMapping("/audit/v2/masters")
	public AuditMasters  getAuditMaster() {
		AuditMasters auditMaster = new AuditMasters();		
		auditMaster.setCombos(comboService.findAlls());
		auditMaster.setSurveyTypeAnswers(surveyTypeAnsService.findAlls());
		auditMaster.setSurveyMobiles(mobileService.findAlls());
		auditMaster.setTypeOutlets(typeOutletService.findAlls());
		auditMaster.setGroupOutlets(groupOutletService.findAlls());
		return auditMaster;
	}

}