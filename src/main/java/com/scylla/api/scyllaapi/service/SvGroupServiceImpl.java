package com.scylla.api.scyllaapi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.scylla.api.scyllaapi.models.SvGroup;
import com.scylla.api.scyllaapi.repository.SvGroupRepository;


@Service
public class SvGroupServiceImpl implements SvGroupService{
	
	@Autowired
	private SvGroupRepository comboRepository;

	@Override
	public List<SvGroup> findAlls() {
		return comboRepository.findAll();
	}
}
