 package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Artist;
import com.nt.repository.I_ArtistRepository;

@Service("artistService")
public class Artist_Management_Service_Implementation implements I_Artist_ManagementService {
	@Autowired
	private I_ArtistRepository artistRepository;
	ArrayList<Integer> idlist = new ArrayList<>(List.of(101, 102, 120));

	
	/*
	 * @Override public String ArtistBulkInjection(List<Artist> list) {
	 * 
	 * Iterable<Artist> artistlist=artistRepository.saveAll(list);
	 * 
	 * 
	 * 
	 * 
	 * artistlist.forEach(artist->{ idlist.add(artist.getAid()); });
	 * 
	 * return
	 * idlist.size()+" this number of records are isserted with values "+idlist.
	 * toString(); }
	 */

		@Override
		public void displayArtistByid() {
			  
			Iterable<Artist> art=artistRepository.findAllById(idlist);
			  for(Artist artist:art) {
				  System.out.println("name is :"+ artist.getAname());
			  }
		}

		@Override
		public Iterable<Artist> displayAllArtist() {
			
			Iterable<Artist> list= artistRepository.findAll();
			return list;
		}



		
		

}
