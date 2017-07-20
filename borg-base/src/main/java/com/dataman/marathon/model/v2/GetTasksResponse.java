package com.dataman.marathon.model.v2;


import com.dataman.util.ModelUtil;

import java.util.Collection;

public class GetTasksResponse {
	private Collection<Task> tasks;

	public Collection<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Collection<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public String toString() {
		return ModelUtil.toString(this);
	}
}
