package com.nt.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Artist;

public interface I_ArtistRepository extends CrudRepository<Artist, Integer> {

	 
}
