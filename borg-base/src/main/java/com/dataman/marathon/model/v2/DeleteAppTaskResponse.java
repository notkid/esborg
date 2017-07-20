package com.dataman.marathon.model.v2;


import com.dataman.util.ModelUtil;

public class DeleteAppTaskResponse {
	private Task task;

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return ModelUtil.toString(this);
	}

}
