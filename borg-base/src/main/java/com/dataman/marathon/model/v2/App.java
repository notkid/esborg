package com.dataman.marathon.model.v2;


import com.dataman.util.ModelUtil;

import java.util.*;

/**
 * @ClassName: App
 * @Description: 查询Marathon的group接口和app接口时有个参数为embed，有些信息需要指定embed参数才会返回，详细说明请查看http://192.168.199.22:8080/api-console/index.html
 * @author biancl 
 * @date 2017年6月14日 下午4:43:20 
 * @Copyright © 2017北京数人科技有限公司
 */
public class App {

	// 应用名称，需要以“集群-id”命名，仅支持字母和数字，不支持汉子
	private String id;

	// 容器启动时执行的cmd命令
	private String cmd;

	// 实例数
	private Integer instances;

	// cpu资源
	private Double cpus;

	// 内存资源
	private Double mem;

	private Collection<String> uris;
	private List<List<String>> constraints;
	private Container container;
	private Map<String, String> env;
	private String executor;
	private List<Integer> ports;
	private Collection<Task> tasks;
	private Integer tasksStaged;
	private Integer tasksRunning;
	private List<HealthCheck> healthChecks;
	//查询Marathon时需要指定embed参数才会展现的字段
	private Integer tasksHealthy;
	private Integer tasksUnhealthy;
	private Map<String,String> labels;
	private List<Object> deployments;
	private List<Object> readinessCheckResults;
	private Map<String,String> lastTaskFailure;
	private Map<String,Object> taskStats;
	private String version;
	
	public App() {

	}

	/**(全量构造函数)
	 * @param id
	 * @param cmd
	 * @param instances
	 * @param cpus
	 * @param mem
	 * @param uris
	 * @param constraints
	 * @param container
	 * @param env
	 * @param executor
	 * @param ports
	 * @param tasks
	 * @param tasksStaged
	 * @param tasksRunning
	 * @param healthChecks
	 * @param tasksHealthy
	 * @param tasksUnhealthy
	 * @param labels
	 * @param deployments
	 * @param readinessCheckResults
	 * @param lastTaskFailure
	 * @param taskStats
	 * @param version
	 */
	public App(String id, String cmd, Integer instances, Double cpus, Double mem, Collection<String> uris,
			List<List<String>> constraints, Container container, Map<String, String> env, String executor,
			List<Integer> ports, Collection<Task> tasks, Integer tasksStaged, Integer tasksRunning,
			List<HealthCheck> healthChecks, Integer tasksHealthy, Integer tasksUnhealthy, Map<String, String> labels,
			List<Object> deployments, List<Object> readinessCheckResults, Map<String, String> lastTaskFailure,
			Map<String, Object> taskStats, String version) {
		super();
		this.id = id;
		this.cmd = cmd;
		this.instances = instances;
		this.cpus = cpus;
		this.mem = mem;
		this.uris = uris;
		this.constraints = constraints;
		this.container = container;
		this.env = env;
		this.executor = executor;
		this.ports = ports;
		this.tasks = tasks;
		this.tasksStaged = tasksStaged;
		this.tasksRunning = tasksRunning;
		this.healthChecks = healthChecks;
		this.tasksHealthy = tasksHealthy;
		this.tasksUnhealthy = tasksUnhealthy;
		this.labels = labels;
		this.deployments = deployments;
		this.readinessCheckResults = readinessCheckResults;
		this.lastTaskFailure = lastTaskFailure;
		this.taskStats = taskStats;
		this.version = version;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public Integer getInstances() {
		return instances;
	}

	public void setInstances(Integer instances) {
		this.instances = instances;
	}

	public Double getCpus() {
		return cpus;
	}

	public void setCpus(Double cpus) {
		this.cpus = cpus;
	}

	public Double getMem() {
		return mem;
	}

	public void setMem(Double mem) {
		this.mem = mem;
	}

	public Collection<String> getUris() {
		return uris;
	}

	public void setUris(Collection<String> uris) {
		this.uris = uris;
	}

	public List<List<String>> getConstraints() {
		return constraints;
	}

	public void setConstraints(List<List<String>> constraints) {
		this.constraints = constraints;
	}

	public void addConstraint(String attribute, String operator, String value) {
		if (this.constraints == null) {
			this.constraints = new ArrayList<List<String>>();
		}
		List<String> constraint = new ArrayList<String>(3);
		constraint.add(attribute == null ? "" : attribute);
		constraint.add(operator == null ? "" : operator);
		constraint.add(value == null ? "" : value);
		this.constraints.add(constraint);
	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public Map<String, String> getEnv() {
		return env;
	}

	public void setEnv(Map<String, String> env) {
		this.env = env;
	}

	public String getExecutor() {
		return executor;
	}

	public void setExecutor(String executor) {
		this.executor = executor;
	}

	public List<Integer> getPorts() {
		return ports;
	}

	public void setPorts(List<Integer> ports) {
		this.ports = ports;
	}

	public void addUri(String uri) {
		if (this.uris == null) {
			this.uris = new ArrayList<String>();
		}
		this.uris.add(uri);
	}

	public void addPort(int port) {
		if (this.ports == null) {
			this.ports = new ArrayList<Integer>();
		}
		this.ports.add(port);
	}

	public Collection<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Collection<Task> tasks) {
		this.tasks = tasks;
	}

	public Integer getTasksStaged() {
		return tasksStaged;
	}

	public void setTasksStaged(Integer tasksStaged) {
		this.tasksStaged = tasksStaged;
	}

	public Integer getTasksRunning() {
		return tasksRunning;
	}

	public void setTasksRunning(Integer tasksRunning) {
		this.tasksRunning = tasksRunning;
	}
	public Map<String, String> getLabels() {
		return labels;
	}
	public void setLabels(Map<String, String> labels) {
		this.labels = labels;
	}
	public void addLabel(Map<String,String> label){
		if(this.labels==null){
			this.labels=new HashMap<String,String> ();
		}
		this.labels.putAll(label);
	}

	/**
	 * tasksHealthy
	 *
	 * @return  the tasksHealthy
	 * @since   1.0.0
	*/
	
	public Integer getTasksHealthy() {
		return tasksHealthy;
	}

	/**
	 * @param tasksHealthy the tasksHealthy to set
	 */
	public void setTasksHealthy(Integer tasksHealthy) {
		this.tasksHealthy = tasksHealthy;
	}

	/**
	 * tasksUnhealthy
	 *
	 * @return  the tasksUnhealthy
	 * @since   1.0.0
	*/
	
	public Integer getTasksUnhealthy() {
		return tasksUnhealthy;
	}

	/**
	 * @param tasksUnhealthy the tasksUnhealthy to set
	 */
	public void setTasksUnhealthy(Integer tasksUnhealthy) {
		this.tasksUnhealthy = tasksUnhealthy;
	}

	/**
	 * deployments
	 *
	 * @return  the deployments
	 * @since   1.0.0
	*/
	
	public List<Object> getDeployments() {
		return deployments;
	}

	/**
	 * @param deployments the deployments to set
	 */
	public void setDeployments(List<Object> deployments) {
		this.deployments = deployments;
	}

	/**
	 * readinessCheckResults
	 *
	 * @return  the readinessCheckResults
	 * @since   1.0.0
	*/
	
	public List<Object> getReadinessCheckResults() {
		return readinessCheckResults;
	}

	/**
	 * @param readinessCheckResults the readinessCheckResults to set
	 */
	public void setReadinessCheckResults(List<Object> readinessCheckResults) {
		this.readinessCheckResults = readinessCheckResults;
	}

	/**
	 * lastTaskFailure
	 *
	 * @return  the lastTaskFailure
	 * @since   1.0.0
	*/
	
	public Map<String, String> getLastTaskFailure() {
		return lastTaskFailure;
	}

	/**
	 * @param lastTaskFailure the lastTaskFailure to set
	 */
	public void setLastTaskFailure(Map<String, String> lastTaskFailure) {
		this.lastTaskFailure = lastTaskFailure;
	}

	/**
	 * taskStats
	 *
	 * @return  the taskStats
	 * @since   1.0.0
	*/
	
	public Map<String, Object> getTaskStats() {
		return taskStats;
	}

	/**
	 * @param taskStats the taskStats to set
	 */
	public void setTaskStats(Map<String, Object> taskStats) {
		this.taskStats = taskStats;
	}

	/**
	 * version
	 *
	 * @return  the version
	 * @since   1.0.0
	*/
	
	public String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * healthChecks
	 *
	 * @return  the healthChecks
	 * @since   1.0.0
	*/
	
	public List<HealthCheck> getHealthChecks() {
		return healthChecks;
	}

	/**
	 * @param healthChecks the healthChecks to set
	 */
	public void setHealthChecks(List<HealthCheck> healthChecks) {
		this.healthChecks = healthChecks;
	}

	@Override
	public String toString() {
		return ModelUtil.toString(this);
	}

}
