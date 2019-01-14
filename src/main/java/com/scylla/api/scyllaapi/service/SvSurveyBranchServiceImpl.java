package com.scylla.api.scyllaapi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.scylla.api.scyllaapi.models.SvSurveyBranch;
import com.scylla.api.scyllaapi.repository.SvSurveyBranchRepository;

@Service
public class SvSurveyBranchServiceImpl implements SvSurveyBranchService{
	
	@Autowired
	private SvSurveyBranchRepository surveyBranchRepository;

	@Override
	public List<SvSurveyBranch> findAlls() {
		// TODO Auto-generated method stub
		return surveyBranchRepository.findAll();
	}



}	
