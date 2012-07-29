package com.anardvir.servlets.beans;

/**
 * 
 * 
 * @author Dvir
 *
 */

public class UserBean {

	/**
	 * Constants
	 */
	public static final int INIT_ID = 1000;
	
	private static int idCounter = INIT_ID;
	
	/** 
	 * Fields
	 */
	private int id;
	private String userName;
	private boolean authenticate;
	
	/**
	 * Constructors
	 * 
	 */
	public UserBean() {
		this.id = idCounter++;
		authenticate = false;
	}
	
	
	public UserBean(String userName, String password) {
		super();
		setId(idCounter++);
		setUserName(userName);
	}

	
	/** 
	 * Setter and Getters
	 * @return
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public boolean getAuthenticate() {
		return authenticate;
	}


	public void setAuthenticate(boolean isAuthenticated) {
		this.authenticate = isAuthenticated;
	}


	
	
	
	
	
}
