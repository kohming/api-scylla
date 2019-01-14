package com.scylla.api.scyllaapi.repository;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scylla.api.scyllaapi.models.SvSurveyTypeOut;


@Repository
public interface SvSurveyTypeOutRepository extends JpaRepository<SvSurveyTypeOut, Integer> {
	
	List<SvSurveyTypeOut> findAll();

}
