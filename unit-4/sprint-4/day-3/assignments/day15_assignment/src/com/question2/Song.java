package com.question2;

import java.util.Objects;

public class Song {
    
	 private String movieName;
	 private String songname;
	 
	 public Song() {
		 
	 }
	 
	 public Song(String movie, String song) {
		 this.movieName = movie;
		 this.songname = song;
	 }

	@Override
	public int hashCode() {
		return Objects.hash(movieName, songname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(movieName, other.movieName) && Objects.equals(songname, other.songname);
	}
	 
	 
	public void play() {
		
		System.out.println(this.songname +" of "+this.movieName+ " is playing...! ");
		
	}
	
}
