package com.scylla.api.scyllaapi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.scylla.api.scyllaapi.models.SvSurveySubdist;
import com.scylla.api.scyllaapi.repository.SvSurveySubDistRepository;

@Service
public class SvSurveySubDistServiceImpl implements SvSurveySubDistService{
	
	@Autowired
	private SvSurveySubDistRepository surveySubDistRepository;

	@Override
	public List<SvSurveySubdist> findAlls() {
		// TODO Auto-generated method stub
		return surveySubDistRepository.findAll();
	}

	

}	
