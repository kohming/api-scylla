package com.scylla.api.scyllaapi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.scylla.api.scyllaapi.models.SvMbl;
import com.scylla.api.scyllaapi.repository.SvMblRepository;


@Service
public class SvMblServiceImpl implements SvMblService{
	
	@Autowired
	private SvMblRepository mblRepository;

	@Override
	public List<SvMbl> findAlls() {
		return mblRepository.findAll();
	}
}
