package com.scylla.api.scyllaapi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.scylla.api.scyllaapi.models.SvSurveyTypeOut;
import com.scylla.api.scyllaapi.repository.SvSurveyTypeOutRepository;

@Service
public class SvSurveyTypeOutServiceImpl implements SvSurveyTypeOutService{
	
	@Autowired
	private SvSurveyTypeOutRepository surveyTypeOutRepository;

	@Override
	public List<SvSurveyTypeOut> findAlls() {
		// TODO Auto-generated method stub
		return surveyTypeOutRepository.findAll();
	}



	

}	
