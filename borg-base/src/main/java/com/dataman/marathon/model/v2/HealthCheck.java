package com.dataman.marathon.model.v2;


import com.dataman.util.ModelUtil;

/**@ClassName: HealthCheck
 * @Description: TODO(健康检查对象) 
 * @author biancl 
 * @date 2017年6月23日 下午5:25:52 
 * @Copyright © 2017北京数人科技有限公司
 */
public class HealthCheck {

	private Command command;
	private Integer gracePeriodSeconds;
	private boolean ignoreHttp1xx;
	private Integer intervalSeconds;
	private Integer maxConsecutiveFailures; 
	private String path;
	private Integer port;
	private Integer portIndex;
	private String protocol;
	private Integer timeoutSeconds;
	/**
	 * command
	 *
	 * @return  the command
	 * @since   1.0.0
	*/
	
	public Command getCommand() {
		return command;
	}
	/**
	 * @param command the command to set
	 */
	public void setCommand(Command command) {
		this.command = command;
	}
	/**
	 * gracePeriodSeconds
	 *
	 * @return  the gracePeriodSeconds
	 * @since   1.0.0
	*/
	
	public Integer getGracePeriodSeconds() {
		return gracePeriodSeconds;
	}
	/**
	 * @param gracePeriodSeconds the gracePeriodSeconds to set
	 */
	public void setGracePeriodSeconds(Integer gracePeriodSeconds) {
		this.gracePeriodSeconds = gracePeriodSeconds;
	}
	/**
	 * ignoreHttp1xx
	 *
	 * @return  the ignoreHttp1xx
	 * @since   1.0.0
	*/
	
	public boolean isIgnoreHttp1xx() {
		return ignoreHttp1xx;
	}
	/**
	 * @param ignoreHttp1xx the ignoreHttp1xx to set
	 */
	public void setIgnoreHttp1xx(boolean ignoreHttp1xx) {
		this.ignoreHttp1xx = ignoreHttp1xx;
	}
	/**
	 * intervalSeconds
	 *
	 * @return  the intervalSeconds
	 * @since   1.0.0
	*/
	
	public Integer getIntervalSeconds() {
		return intervalSeconds;
	}
	/**
	 * @param intervalSeconds the intervalSeconds to set
	 */
	public void setIntervalSeconds(Integer intervalSeconds) {
		this.intervalSeconds = intervalSeconds;
	}
	/**
	 * maxConsecutiveFailures
	 *
	 * @return  the maxConsecutiveFailures
	 * @since   1.0.0
	*/
	
	public Integer getMaxConsecutiveFailures() {
		return maxConsecutiveFailures;
	}
	/**
	 * @param maxConsecutiveFailures the maxConsecutiveFailures to set
	 */
	public void setMaxConsecutiveFailures(Integer maxConsecutiveFailures) {
		this.maxConsecutiveFailures = maxConsecutiveFailures;
	}
	/**
	 * path
	 *
	 * @return  the path
	 * @since   1.0.0
	*/
	
	public String getPath() {
		return path;
	}
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * port
	 *
	 * @return  the port
	 * @since   1.0.0
	*/
	
	public Integer getPort() {
		return port;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(Integer port) {
		this.port = port;
	}
	/**
	 * portIndex
	 *
	 * @return  the portIndex
	 * @since   1.0.0
	*/
	
	public Integer getPortIndex() {
		return portIndex;
	}
	/**
	 * @param portIndex the portIndex to set
	 */
	public void setPortIndex(Integer portIndex) {
		this.portIndex = portIndex;
	}
	/**
	 * protocol
	 *
	 * @return  the protocol
	 * @since   1.0.0
	*/
	
	public String getProtocol() {
		return protocol;
	}
	/**
	 * @param protocol the protocol to set
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	/**
	 * timeoutSeconds
	 *
	 * @return  the timeoutSeconds
	 * @since   1.0.0
	*/
	
	public Integer getTimeoutSeconds() {
		return timeoutSeconds;
	}
	/**
	 * @param timeoutSeconds the timeoutSeconds to set
	 */
	public void setTimeoutSeconds(Integer timeoutSeconds) {
		this.timeoutSeconds = timeoutSeconds;
	}
	@Override
	public String toString() {
		return ModelUtil.toString(this);
	}
}
