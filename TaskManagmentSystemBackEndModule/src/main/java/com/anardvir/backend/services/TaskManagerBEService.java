package com.anardvir.backend.services;

import java.util.List;

import com.anardvir.backend.objects.TaskBE;
import com.anardvir.backend.objects.UserBE;

public interface TaskManagerBEService {

	void assignUserToTask(UserBE user, TaskBE task);
	
	List<TaskBE> getUserTasks(UserBE user);
	
	void removeTask(int taskId);
	
	void updateTask(TaskBE task);
}
