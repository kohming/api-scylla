package com.scylla.api.scyllaapi.repository;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.scylla.api.scyllaapi.models.SvMbl;


@Repository
public interface SvMblRepository extends JpaRepository<SvMbl, Integer> {
	
	List<SvMbl> findAll();

}
