package com.scylla.api.scyllaapi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.scylla.api.scyllaapi.models.SvMblGroupOut;

@Repository
public interface SvMblGroupOutletRepository extends JpaRepository<SvMblGroupOut, Integer> {
	
	List<SvMblGroupOut> findAll();
}
