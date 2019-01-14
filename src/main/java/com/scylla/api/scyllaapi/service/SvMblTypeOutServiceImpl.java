package com.scylla.api.scyllaapi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.scylla.api.scyllaapi.models.SvMblTypeOut;
import com.scylla.api.scyllaapi.repository.SvMblTypeOutletRepository;


@Service
public class SvMblTypeOutServiceImpl implements SvMblTypeOutService{
	
	@Autowired
	private SvMblTypeOutletRepository mblTypeOutRepository;

	@Override
	public List<SvMblTypeOut> findAlls() {
		// TODO Auto-generated method stub
		return mblTypeOutRepository.findAll();
	}

	

}
