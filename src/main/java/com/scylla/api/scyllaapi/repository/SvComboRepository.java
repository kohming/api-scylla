package com.scylla.api.scyllaapi.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.scylla.api.scyllaapi.models.SvCombo;


@Repository
public interface SvComboRepository extends JpaRepository<SvCombo, Integer> {
	
	List<SvCombo> findAll();

}
