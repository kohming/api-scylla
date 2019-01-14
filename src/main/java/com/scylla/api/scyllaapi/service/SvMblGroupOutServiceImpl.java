package com.scylla.api.scyllaapi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.scylla.api.scyllaapi.models.SvMblGroupOut;
import com.scylla.api.scyllaapi.repository.SvMblGroupOutletRepository;

@Service
public class SvMblGroupOutServiceImpl implements SvMblGroupOutService{
	
	@Autowired
	private SvMblGroupOutletRepository mblGroupOutRepository;

	@Override
	public List<SvMblGroupOut> findAlls() {
		// TODO Auto-generated method stub
		return mblGroupOutRepository.findAll();
	}

	

}
