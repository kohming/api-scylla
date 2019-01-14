package com.scylla.api.scyllaapi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.scylla.api.scyllaapi.models.SvSurveyTypeAns;
import com.scylla.api.scyllaapi.repository.SvSurveyTypeAnsRepository;


@Service
public class SvSurveyTypeAnsServiceImpl implements SvSurveyTypeAnsService{
	
	@Autowired
	private SvSurveyTypeAnsRepository surveyTypeAnsRepository;

	@Override
	public List<SvSurveyTypeAns> findAlls() {
		// TODO Auto-generated method stub
		return surveyTypeAnsRepository.findAll();
	}



	

}	
