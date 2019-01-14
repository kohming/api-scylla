package com.scylla.api.scyllaapi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.scylla.api.scyllaapi.models.SvResult;
import com.scylla.api.scyllaapi.repository.SvResultRepository;

@Service
public class SvResultServiceImpl implements SvResultService{
	
	@Autowired
	private SvResultRepository resultRepository;

	@Override
	public List<SvResult> findAlls() {
		// TODO Auto-generated method stub
		return resultRepository.findAll();
	}

}	
