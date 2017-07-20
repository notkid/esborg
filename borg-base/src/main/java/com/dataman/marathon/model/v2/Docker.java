package com.dataman.marathon.model.v2;


import com.dataman.util.ModelUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Docker {
	private String image;
	private String network;
	private Collection<Port> portMappings;
	private boolean forcePullImage;
	private List<Parameters> parameters;
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public Collection<Port> getPortMappings() {
		return portMappings;
	}

	public void setPortMappings(Collection<Port> portMappings) {
		this.portMappings = portMappings;
	}

	/**
	 * forcePullImage
	 *
	 * @return  the forcePullImage
	 * @since   1.0.0
	*/
	
	public boolean isForcePullImage() {
		return forcePullImage;
	}

	/**
	 * @param forcePullImage the forcePullImage to set
	 */
	public void setForcePullImage(boolean forcePullImage) {
		this.forcePullImage = forcePullImage;
	}

	/**
	 * parameters
	 *
	 * @return  the parameters
	 * @since   1.0.0
	*/
	
	public List<Parameters> getParameters() {
		return parameters;
	}

	/**
	 * @param parameters the parameters to set
	 */
	public void setParameters(List<Parameters> parameters) {
		this.parameters = parameters;
	}

	public void addParameters(Parameters parameters){
		if(this.parameters==null){
			this.parameters=new ArrayList<Parameters>();
		}
		this.parameters.add(parameters);
	}
	@Override
	public String toString() {
		return ModelUtil.toString(this);
	}
}
