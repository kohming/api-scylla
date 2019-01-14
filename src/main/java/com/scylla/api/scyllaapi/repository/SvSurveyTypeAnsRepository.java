package com.scylla.api.scyllaapi.repository;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.scylla.api.scyllaapi.models.SvSurveyTypeAns;


@Repository
public interface SvSurveyTypeAnsRepository extends JpaRepository<SvSurveyTypeAns, Integer> {
	
	List<SvSurveyTypeAns> findAll();

}
