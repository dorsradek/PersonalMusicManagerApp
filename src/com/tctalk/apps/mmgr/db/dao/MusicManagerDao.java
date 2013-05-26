package com.tctalk.apps.mmgr.db.dao;

import java.util.List;

import com.tctalk.apps.mmgr.db.businessobjects.AlbumtblBO;

public interface MusicManagerDao {
	public List<AlbumtblBO> getAllMusicAlbumsFromCollection();
	
	public boolean addAlbum(AlbumtblBO album);
	
	public boolean delAlbum(int albumId);
}
