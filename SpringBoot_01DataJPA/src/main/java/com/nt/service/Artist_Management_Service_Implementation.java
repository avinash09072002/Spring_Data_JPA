 package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Artist;
import com.nt.repository.I_ArtistRepository;

@Service("artistService")
public class Artist_Management_Service_Implementation implements I_Artist_ManagementService {
	@Autowired
	private I_ArtistRepository artistRepository;

		@Override
		public String registerArtist(Artist artist) {
			
		  System.out.println("proxy class name --->"+artistRepository.getClass());
	        //use repo
			Artist artist1=artistRepository.save(artist); //
			
			
			return artist1.getAid()==null?"Record not inserted":"successfully Inserted";
		}

		@Override
		public boolean checkArtistAvailability(Integer id) {
			
			boolean flag=artistRepository.existsById(id);
			return flag;
		}

		@Override
		public long giveArtistCount() {
			
			return artistRepository.count();
		}
		

}
