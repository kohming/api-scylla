package com.scylla.api.scyllaapi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.scylla.api.scyllaapi.models.SvSurveyGroupOut;
import com.scylla.api.scyllaapi.repository.SvSurveyGroupOutRepository;

@Service
public class SvSurveyGroupOutServiceImpl implements SvSurveyGroupOutService{
	
	@Autowired
	private SvSurveyGroupOutRepository surveyGroupOutRepository;

	@Override
	public List<SvSurveyGroupOut> findAlls() {
		// TODO Auto-generated method stub
		return surveyGroupOutRepository.findAll();
	}

}	
