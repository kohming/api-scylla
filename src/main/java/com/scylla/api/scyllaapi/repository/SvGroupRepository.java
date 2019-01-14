package com.scylla.api.scyllaapi.repository;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.scylla.api.scyllaapi.models.SvGroup;


@Repository
public interface SvGroupRepository extends JpaRepository<SvGroup, Integer> {
	
	List<SvGroup> findAll();

}
