package com.tctalk.apps.mmgr.db.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.tctalk.apps.mmgr.db.businessobjects.AlbumtblBO;
import com.tctalk.apps.mmgr.utils.HibernateUtils;

public class MusicManagerDaoImpl implements MusicManagerDao {

	public List<AlbumtblBO> getAllMusicAlbumsFromCollection() {
		List<AlbumtblBO> albumList = null;
		Session hbmSession = null;
		try {
			hbmSession = HibernateUtils.getSession();
			Criteria criteria = hbmSession.createCriteria(AlbumtblBO.class);
			albumList = criteria.list();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			HibernateUtils.closeSession(hbmSession);
		}

		return albumList;
	}

	
	public boolean addAlbum(AlbumtblBO album) {
		Session hbmSession = null;
		boolean STATUS_FLAG = true;
		try {
			hbmSession = HibernateUtils.getSession();
			hbmSession.beginTransaction();
			//add the album to the hibernate session to save
			hbmSession.save(album);
			hbmSession.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			STATUS_FLAG = false;
		} finally {
			HibernateUtils.closeSession(hbmSession);
		}
		return STATUS_FLAG;
	}
	
	public boolean delAlbum(int albumId) {
		Session hbmSession = null;
		boolean STATUS_FLAG = true;
		try {
			hbmSession = HibernateUtils.getSession();
			hbmSession.beginTransaction();
			//first retrieve the album corresponds to that id
			AlbumtblBO albumObj = (AlbumtblBO)hbmSession.load(AlbumtblBO.class, albumId);
			hbmSession.delete(albumObj);
			hbmSession.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			STATUS_FLAG = false;
		} finally {
			HibernateUtils.closeSession(hbmSession);
		}
		return STATUS_FLAG;
	}

}
