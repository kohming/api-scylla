package com.scylla.api.scyllaapi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.scylla.api.scyllaapi.models.SvSurvey;
import com.scylla.api.scyllaapi.repository.SvSurveyRepository;

@Service
public class SvSurveyServiceImpl implements SvSurveyService{
	
	@Autowired
	private SvSurveyRepository surveyRepository;

	@Override
	public List<SvSurvey> findAlls() {
		// TODO Auto-generated method stub
		return surveyRepository.findAll();
	}

}	
