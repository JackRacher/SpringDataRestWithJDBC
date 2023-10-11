package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.models.Alien;
import java.util.List;


@RepositoryRestResource(collectionResourceRel = "aliens", path="aliens")
public interface AlienRepo extends JpaRepository<Alien, Integer>
{
	//@RestResource(path = "name", rel = "name")
	List<Alien> findByAname(@Param("name") String aname);
	

}
