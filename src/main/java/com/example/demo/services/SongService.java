package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Song;

public interface SongService {
	public void addSong(Song song);
	
	public List<Song> fetchAllSongs();
	
	public boolean songExist(String name);
	
	public static void upadateSong(Song songs) {
		// TODO Auto-generated method stub
		
	}

	}

	



