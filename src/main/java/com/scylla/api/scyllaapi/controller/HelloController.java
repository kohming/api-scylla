package com.scylla.api.scyllaapi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.scylla.api.scyllaapi.models.AuditMaster;
import com.scylla.api.scyllaapi.models.SvCombo;
import com.scylla.api.scyllaapi.models.SvGroup;
import com.scylla.api.scyllaapi.models.SvSurvey;
import com.scylla.api.scyllaapi.service.SvComboService;
import com.scylla.api.scyllaapi.service.SvGroupService;
import com.scylla.api.scyllaapi.service.SvSurveyBranchService;
import com.scylla.api.scyllaapi.service.SvSurveyGroupOutService;
import com.scylla.api.scyllaapi.service.SvSurveyService;
import com.scylla.api.scyllaapi.service.SvSurveySubDistService;
import com.scylla.api.scyllaapi.service.SvSurveyTypeAnsService;
import com.scylla.api.scyllaapi.service.SvSurveyTypeOutService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
	@Autowired
	SvComboService comboService;
	
	@Autowired
	SvGroupService groupService;
	
	@Autowired
	SvSurveyService surveyService;
	
	@Autowired
	SvSurveyBranchService surveyBranchService;
	
	@Autowired
	SvSurveyGroupOutService surveyGroupOutService;
	
	@Autowired
	SvSurveySubDistService surveySubDistService;
	
	@Autowired
	SvSurveyTypeOutService surveyTypeOutService;
	
	@Autowired
	SvSurveyTypeAnsService surveyTypeAnsService;


	@RequestMapping("/hello")
	public List<SvCombo>  getCombo() {
		return comboService.findAlls();
	}
	
	@RequestMapping("/hello2")
	public List<SvGroup>  getGroup() {
		return groupService.findAlls();
	}
	
	@RequestMapping("/surveys")
	public List<SvSurvey>  getSurvey() {
		return surveyService.findAlls();
	}
	
	@RequestMapping("/audit/masters")
	public AuditMaster  getAuditMaster() {
		AuditMaster auditMaster = new AuditMaster();		
		auditMaster.setCombos(comboService.findAlls());
		auditMaster.setGroups(groupService.findAlls());
		auditMaster.setSurveyBranchs(surveyBranchService.findAlls());
		auditMaster.setSurveyGroupOuts(surveyGroupOutService.findAlls());
		auditMaster.setSurveySubdist(surveySubDistService.findAlls());
		auditMaster.setSurveyTypeOut(surveyTypeOutService.findAlls());
		auditMaster.setSurveyTypeAns(surveyTypeAnsService.findAlls());
		return auditMaster;
	}

}