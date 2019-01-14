package com.scylla.api.scyllaapi.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.scylla.api.scyllaapi.models.SvResult;


@Repository
public interface SvResultRepository extends JpaRepository<SvResult, Integer> {
	
	List<SvResult> findAll();

}
