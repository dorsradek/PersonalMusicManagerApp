package com.tctalk.apps.mmgr.web.delegates;

import java.util.List;

import com.tctalk.apps.mmgr.db.businessobjects.AlbumtblBO;
import com.tctalk.apps.mmgr.db.dao.MusicManagerDao;
import com.tctalk.apps.mmgr.db.dao.MusicManagerDaoImpl;

public class MusicManagerDelegate {
	MusicManagerDao mmgrDao = (MusicManagerDao) new MusicManagerDaoImpl();
	
	public List<AlbumtblBO> getAllMusicAlbums() {		
		return mmgrDao.getAllMusicAlbumsFromCollection();
	}
	
	public boolean addAlbumToCollection(AlbumtblBO albumobj) {
		return mmgrDao.addAlbum(albumobj);
	}
	
	public boolean delAlbumFromCollection(int albumId) {
		return mmgrDao.delAlbum(albumId);
	}
}
