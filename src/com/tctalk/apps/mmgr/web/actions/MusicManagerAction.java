package com.tctalk.apps.mmgr.web.actions;


import java.util.List;

import com.tctalk.apps.mmgr.db.businessobjects.AlbumtblBO;
import com.tctalk.apps.mmgr.web.delegates.MusicManagerDelegate;
import com.tctalk.apps.mmgr.web.forms.MusicManagerForm;

public class MusicManagerAction extends MusicManagerForm {

	private static final long serialVersionUID = 9168149105719285096L;
	private MusicManagerDelegate musicMgrDelegate = new MusicManagerDelegate();
	
	public String getAllAlbumList(){
		List<AlbumtblBO> albumList = musicMgrDelegate.getAllMusicAlbums();
		String returnString = ERROR;
		
		if(albumList != null) {
			setAlbumList(albumList);
			returnString = SUCCESS;
		}
		return returnString;
	}
	
	public String addAlbumToCollection(){
		String returnString = ERROR;
		AlbumtblBO album = getAlbum();
		
		if(musicMgrDelegate.addAlbumToCollection(album)){
			returnString = SUCCESS;
		}
		
		return returnString;
	}
	
	public String delAlbumFromCollection(){
		String returnString = ERROR;
		
		int albumId = getMusicId();
		if(musicMgrDelegate.delAlbumFromCollection(albumId)) {
			returnString = SUCCESS;
		}
		
		return returnString;
	}
}
