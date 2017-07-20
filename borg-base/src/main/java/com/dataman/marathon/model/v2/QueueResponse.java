package com.dataman.marathon.model.v2;


import com.dataman.util.ModelUtil;

import java.util.Collection;

public class QueueResponse {

	private Collection<QueueElement> queue;

	public Collection<QueueElement> getQueue() {
		return queue;
	}

	public void setQueue(Collection<QueueElement> queue) {
		this.queue = queue;
	}

	@Override
	public String toString() {
		return ModelUtil.toString(this);
	}
}
