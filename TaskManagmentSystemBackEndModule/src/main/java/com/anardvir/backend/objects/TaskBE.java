package com.anardvir.backend.objects;

import java.util.Date;
import java.util.Map;

public class TaskBE {

	public enum TaskStatus {
		Done,
		InProgress,
		NotStarted,
		Waiting
	}
	
	private int taskId;
	
	private String description;
	
	private Date allert;
	
	private Date deadline;
	
	private UserBE owner;
	
	private TaskStatus status;
	
	private Map<Integer, TaskBE> taskDependencies;

	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getAllert() {
		return allert;
	}

	public void setAllert(Date allert) {
		this.allert = allert;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public UserBE getOwner() {
		return owner;
	}

	public void setOwner(UserBE owner) {
		this.owner = owner;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public Map<Integer, TaskBE> getTaskDependencies() {
		return taskDependencies;
	}

	public void setTaskDependencies(Map<Integer, TaskBE> taskDependencies) {
		this.taskDependencies = taskDependencies;
	}
	
	
	
	
	
	
	
	
	
	
}



