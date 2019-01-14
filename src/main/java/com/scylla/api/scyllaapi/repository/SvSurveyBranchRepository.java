package com.scylla.api.scyllaapi.repository;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.scylla.api.scyllaapi.models.SvSurveyBranch;


@Repository
public interface SvSurveyBranchRepository extends JpaRepository<SvSurveyBranch, Integer> {
	
	List<SvSurveyBranch> findAll();

}
