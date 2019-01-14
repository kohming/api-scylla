package com.scylla.api.scyllaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scylla.api.scyllaapi.models.SvCombo;
import com.scylla.api.scyllaapi.repository.SvComboRepository;


@Service
public class SvComboServiceImpl implements SvComboService{
	
	@Autowired
	private SvComboRepository comboRepository;

	@Override
	public List<SvCombo> findAlls() {
		// TODO Auto-generated method stub
		return comboRepository.findAll();
	}

	
}
