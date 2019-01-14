package com.scylla.api.scyllaapi.repository;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.scylla.api.scyllaapi.models.SvSurveySubdist;


@Repository
public interface SvSurveySubDistRepository extends JpaRepository<SvSurveySubdist, Integer> {
	
	List<SvSurveySubdist> findAll();

}
