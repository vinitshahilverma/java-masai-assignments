package com.question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   
		PlayList playlist = new PlayList();
		
		for(int i=0; i<4; i++) {
			
			System.out.println("Enter the deatils of the song "+(i+1));
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter movie Name "+(i+1));
			String movie = sc.next();
			
			System.out.println("Enter Song Name "+(i+1));
			String songname = sc.next();
			
			
			Song song = new Song(movie,songname);
			
			playlist.addSong(song);
			
		}
		
		 for(int i=0; i<playlist.songs.size(); i++) {
			 
			 playlist.songs.get(i).play();
			 
			 
		 }
		 
		 
		     
	}

}
