package com.nt.service;

import com.nt.entity.Artist;

public interface I_Artist_ManagementService {
	
	public String registerArtist(Artist artist);     //business terminology to register the Artist in db table
    public boolean checkArtistAvailability(Integer id);
    
    public long giveArtistCount();
}
