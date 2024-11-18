package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nt.entity.Artist;

public interface I_Artist_ManagementService {
	
	public String  removeArtistByIdsInBatch(List<Integer> ids);
   public List<Artist> searchArtistByGivenData(String name, double fee);
}
