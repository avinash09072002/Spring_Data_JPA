package com.nt.service;

import java.util.List;

import com.nt.entity.Artist;

public interface I_Artist_ManagementService {
	
	/*
	 * public String registerArtist(Artist artist); //business terminology to
	 * register the Artist in db table public boolean
	 * checkArtistAvailability(Integer id);
	 * 
	 * public long giveArtistCount();
	 */
    
 //   public String ArtistBulkInjection(List<Artist> list);
    public void displayArtistByid();
    
    public Iterable<Artist> displayAllArtist();
}
