package com.anardvir.backend.objects;

import java.util.List;
import java.util.Map;

/**
 * 
 * Present the User Back-End Object
 * 
 * 
 * @author Dvir
 *
 */
public class UserBE {
	
	private String mail;
	
	private String fName;
	
	private String lName;
	
	private String nickName;
	
	private List<TaskBE> tasks;
	
	private List<UserBE> superiors;
	
	private List<UserBE> workers;

	
	
	
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public List<TaskBE> getTasks() {
		return tasks;
	}

	public void setTasks(List<TaskBE> tasks) {
		this.tasks = tasks;
	}

	public List<UserBE> getSuperiors() {
		return superiors;
	}

	public void setSuperiors(List<UserBE> superiors) {
		this.superiors = superiors;
	}

	public List<UserBE> getWorkers() {
		return workers;
	}

	public void setWorkers(List<UserBE> workers) {
		this.workers = workers;
	}
	
	
	
	
	
}
