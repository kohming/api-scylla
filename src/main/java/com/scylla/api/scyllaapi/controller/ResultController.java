package com.scylla.api.scyllaapi.controller;

import com.scylla.api.scyllaapi.models.SvResult;
import com.scylla.api.scyllaapi.service.SvResultService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {
	
	@Autowired
	SvResultService resultService;
	

	
	@RequestMapping("/audit/v2/results")
	public List<SvResult>  getResults() {
		return resultService.findAlls();
	}

}