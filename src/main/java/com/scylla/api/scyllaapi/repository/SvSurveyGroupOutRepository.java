package com.scylla.api.scyllaapi.repository;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.scylla.api.scyllaapi.models.SvSurveyGroupOut;


@Repository
public interface SvSurveyGroupOutRepository extends JpaRepository<SvSurveyGroupOut, Integer> {
	
	List<SvSurveyGroupOut> findAll();

}
