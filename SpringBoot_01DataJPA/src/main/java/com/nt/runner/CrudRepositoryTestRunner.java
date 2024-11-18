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
		
		Artist artist= new Artist("baja","labor",700);
		//invoke the business method, or call the business/service class method
		
		  try {
		  
		  String msg=artistService.registerArtist(artist);
		  System.out.println(msg);
		  
		  }catch (Exception e) { e.printStackTrace(); }
		 
		
		
		// to check the existsById()
		
		/*
		 * try { System.out.println("Artist is available or not ?"
		 * +artistService.checkArtistAvailability(101));
		 * 
		 * }catch (Exception e) { e.printStackTrace(); }
		 */
		
		// to check the total number of records(rows)in the table
		
		/*
		 * try { long count=artistService.giveArtistCount();
		 * System.out.println("the total number of artist Record is "+count); }catch
		 * (Exception e) { e.printStackTrace(); }
		 */

	}//method
}//class
	
