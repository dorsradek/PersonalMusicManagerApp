package com.tctalk.apps.mmgr.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory hbmSessionFactory;

	static {
		try {
			Configuration cfg = new Configuration()
					.configure(MusicMgrConstant._HIBERNATE_CONFIG_LOCATION);
			hbmSessionFactory = cfg.buildSessionFactory();
		} catch (RuntimeException ex) {
			System.out.println("********* Error occurred while reading config file *********");
			ex.printStackTrace();
		}
	}

	/**
	 * getSession creates hibernate Session & returns it
	 */
	public static Session getSession() {
		return hbmSessionFactory.openSession();
	}


	/**
	 * closeSession closes the session, if it exists
	 */
	public static void closeSession(Session inSession) {
		if (inSession != null) {
			inSession.close();
		}
	}
}
