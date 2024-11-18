package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.nt.entity.Artist;
import com.nt.service.I_Artist_ManagementService;


@Component
@Profile({"prod", "test"})
public class CrudRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private I_Artist_ManagementService artistService;

	@Override
	public void run(String... args) throws Exception {
		
	try {
		String msg=artistService.hikeArtistByIdandPercentage(122, 2);
		System.out.println(msg);
		
	} catch (Exception e) {
		e.printStackTrace();
	}

	}//method
}//class
	
