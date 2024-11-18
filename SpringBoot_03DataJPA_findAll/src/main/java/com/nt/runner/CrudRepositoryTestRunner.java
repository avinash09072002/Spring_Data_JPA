package com.nt.runner;

import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.List;

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
		
		
		/*
		 * Artist artist1= new Artist("mahesh","kkm",333); Artist artist2= new
		 * Artist("kartik","bhujbal",777);
		 * 
		 * List<Artist> list= new ArrayList<>(); list.add(artist1); list.add(artist2)
		 */;
//		 
//		try {
//			String msgString= artistService.ArtistBulkInjection(list);
//			System.out.println(msgString);
//			
//		}catch (Exception e) {
//            e.printStackTrace();
//		}
		
	     try {
	    	  List<Integer> artistIds = List.of(120,102,101);
               artistService.displayArtistByid();	    
	    	 
	     }catch (Exception e) {
			e.printStackTrace();
		}
	     
	     try {
			Iterable<Artist> lisst=artistService.displayAllArtist();
			for(Artist artist:lisst) {
				System.out.println(artist);
			}
		 
		}catch (Exception e) {
			e.printStackTrace();
		}

	}//method
}//class
	
