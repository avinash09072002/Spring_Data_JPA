package com.nt.runner;

import java.awt.print.Pageable;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Artist;
import com.nt.service.I_Artist_ManagementService;


@Component
@Profile({"prod", "test"})
public class JPA_Repository_TestRunner implements CommandLineRunner {
	@Autowired
	private I_Artist_ManagementService artistService;

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * try { String
		 * message=artistService.removeArtistByIdsInBatch(List.of(205,206,207));
		 * 
		 * System.out.println(message); } catch (Exception e) { e.printStackTrace(); }
		 */
		
		try {
			List<Artist> list= artistService.searchArtistByGivenData("Ravi", 1000);
			System.out.println(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//method
}//class
	
