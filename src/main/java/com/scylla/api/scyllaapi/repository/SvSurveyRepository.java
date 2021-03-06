package com.scylla.api.scyllaapi.repository;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.scylla.api.scyllaapi.models.SvSurvey;


@Repository
public interface SvSurveyRepository extends JpaRepository<SvSurvey, Integer> {
	
	List<SvSurvey> findAll();

}
