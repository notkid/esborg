package com.dataman.marathon.model.v2;


import com.dataman.util.ModelUtil;

public class Volume {
	private String containerPath;
	private String hostPath;
	private String mode;

	public String getContainerPath() {
		return containerPath;
	}

	public void setContainerPath(String containerPath) {
		this.containerPath = containerPath;
	}

	public String getHostPath() {
		return hostPath;
	}

	public void setHostPath(String hostPath) {
		this.hostPath = hostPath;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		return ModelUtil.toString(this);
	}
}
