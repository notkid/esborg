package com.dataman.marathon.model.v2;


import com.dataman.util.ModelUtil;

import java.util.Collection;

public class GetGroupsResponse {
	private Collection<Group> groups;

	public Collection<Group> getGroups() {
		return groups;
	}

	public void setGroups(Collection<Group> groups) {
		this.groups = groups;
	}

	@Override
	public String toString() {
		return ModelUtil.toString(this);
	}
}
