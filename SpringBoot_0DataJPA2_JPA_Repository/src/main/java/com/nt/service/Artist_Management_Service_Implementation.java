package com.nt.service;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.SortDirection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Artist;
import com.nt.repository.I_ArtistRepository;

@Service("artistService")
public class Artist_Management_Service_Implementation implements I_Artist_ManagementService {
    @Autowired
    private I_ArtistRepository artistRepository;

   @Override
public String removeArtistByIdsInBatch(List<Integer> ids) {
	
	   List<Artist> list=artistRepository.findAllById(ids);
	   //delete object by ids in batch processing
	   List<String> list1= new ArrayList<>();
	   
	   list.forEach(artist->{
		   list1.add(artist.getAname());
	   });
	   System.out.println("this names are deleted "+list1);
	   
	   artistRepository.deleteAllByIdInBatch(ids);
	  
	return list.size()+" records deleted ";
}
    	@Override
    	public List<Artist> searchArtistByGivenData(String name, double fee) {
    		
    		Artist artist= new Artist();
    		artist.setAname(name);
    		artist.setFee(fee);
    		
    		Example<Artist> example= Example.of(artist);
    		List<Artist> list=artistRepository.findAll(example);
    		return list;
    	}
    	
    }

