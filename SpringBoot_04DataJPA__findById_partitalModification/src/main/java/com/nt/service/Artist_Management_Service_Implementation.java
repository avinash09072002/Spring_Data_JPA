 package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Artist;
import com.nt.repository.I_ArtistRepository;

@Service("artistService")
public class Artist_Management_Service_Implementation implements I_Artist_ManagementService {
	@Autowired
	private I_ArtistRepository artistRepository;

		@Override
		public String hikeArtistByIdandPercentage(int id, double per) {
			Optional<Artist> opt= artistRepository.findById(id);
			
			if(opt.isPresent()) {
				Artist artist=opt.get();
				artist.setFee(artist.getFee()+artist.getFee()*per);
				artistRepository.save(artist);
				return "artist is found and fee is modified";
			}else {
				return "artist is not found ";
			}
			
			
		}

}
