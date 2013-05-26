package com.tctalk.apps.mmgr.web.forms;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.tctalk.apps.mmgr.db.businessobjects.AlbumtblBO;

public class MusicManagerForm extends ActionSupport {

	private static final long serialVersionUID = 706337856877546963L;

	private List<AlbumtblBO> albumList 			= null;
	private AlbumtblBO album					= null;
	private int musicId;
	
	public AlbumtblBO getAlbum() {
		return album;
	}

	public void setAlbum(AlbumtblBO album) {
		this.album = album;
	}
	
	public List<AlbumtblBO> getAlbumList() {
		return albumList;
	}
	
	public void setAlbumList(List<AlbumtblBO> albumList) {
		this.albumList = albumList;
	}
	
	public int getMusicId() {
		return musicId;
	}
	
	public void setMusicId(int musicId) {
		this.musicId = musicId;
	}
	
}
