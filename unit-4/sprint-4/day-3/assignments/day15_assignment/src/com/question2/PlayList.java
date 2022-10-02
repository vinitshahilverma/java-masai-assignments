package com.question2;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
   
	public List<Song> songs = new ArrayList<>();
	
	
	public void addSong(Song song) {
		 
		boolean flag = false;
		
		for(int i=0; i<songs.size(); i++) {
			
			if(songs.get(i).equals(song)==true) {
				flag = true;
			}

		}
		 
		
		if(flag==true) {
			
			System.out.println("Song is already added in the playlist");
		}
	      
		else {
			
	    	 songs.add(song); 
	    	 System.out.println("Song added to the playlist successfully");
	    	 
		}
	}
	 
}
