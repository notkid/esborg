package com.dataman.marathon;

import com.dataman.marathon.model.v2.*;
import com.dataman.util.ResponseException;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface Marathon {

	// 应用模块:Apps
	@RequestLine("GET /v2/apps?embed=apps.readiness&embed=apps.tasks&embed=apps.count&embed=apps.deployments&embed=apps.lastTaskFailure&embed=apps.taskStats")
	GetAppsResponse getApps() throws ResponseException;

	@RequestLine("GET /v2/apps/{id}?embed=app.readiness&embed=app.tasks&embed=app.count&embed=app.deployments&embed=app.lastTaskFailure&embed=app.taskStats")
	GetAppResponse getApp(@Param("id") String id) throws ResponseException;

	@RequestLine("GET /v2/apps/{id}/tasks")
	GetAppTasksResponse getAppTasks(@Param("id") String id) throws ResponseException;

	/**
	 * @method getAppVsersion(根据应用版本获取指定应用的版本)
	 * @return Object
	 * @author 张海阳
	 * @date 2017年6月19日 上午10:29:36
	 */
	@RequestLine("GET /v2/apps/{id}/versions")
	Object getAppVsersion(@Param("id") String id) throws ResponseException;

	/**
	 * @method getAppVsersion(根据应用id和版本号获取应用指定版本)
	 * @return GetAppResponse
	 * @author 张海阳
	 * @date 2017年6月9日 上午10:41:52
	 */
	@RequestLine("GET /v2/apps/{id}/versions/{version}")
	Object getAppVsersion(@Param("id") String id, @Param("version") String version) throws ResponseException;

	@RequestLine("POST /v2/apps")
	App createApp(App app) throws ResponseException;
	
	@RequestLine("POST /v2/apps")
	App createApp2(App app) throws Exception;

	@RequestLine("PUT /v2/apps/{app_id}?force={force}")
	void updateApp(@Param("app_id") String appId, App app, @Param("force") boolean force) throws ResponseException;

	@RequestLine("POST /v2/apps/{id}/restart?force={force}")
	void restartApp(@Param("id") String id, @Param("force") boolean force) throws ResponseException;

	@RequestLine("DELETE /v2/apps/{id}")
	Result deleteApp(@Param("id") String id) throws ResponseException;

	@RequestLine("DELETE /v2/apps/{app_id}/tasks?host={host}&scale={scale}")
	DeleteAppTasksResponse deleteAppTasks(@Param("app_id") String appId, @Param("host") String host,
                                          @Param("scale") boolean scale) throws ResponseException;

	@RequestLine("DELETE /v2/apps/{app_id}/tasks/{task_id}?scale={scale}")
	DeleteAppTaskResponse deleteAppTask(@Param("app_id") String appId, @Param("task_id") String taskId,
                                        @Param("scale") boolean scale) throws ResponseException;

	// Groups
	@RequestLine("GET /v2/groups")
	Group getGroups() throws ResponseException;

	/**
	 * @method getGroupsEmbed(添加嵌入app count、task信息和readiness信息)
	 * @return Group
	 * @author biancl
	 * @date 2017年6月13日 下午1:51:08
	 */
	@RequestLine("GET /v2/groups?embed=group.groups&embed=group.apps&embed=group.apps.tasks&embed=group.apps.counts&embed=group.apps.deployments&embed=group.apps.readiness&embed=group.apps.lastTaskFailure&embed=group.apps.taskStats")
	Group getGroupsEmbed() throws ResponseException;

	@RequestLine("POST /v2/groups")
	Result createGroup(Group group) throws ResponseException;

	@RequestLine("DELETE /v2/groups/{id}")
	Result deleteGroup(@Param("id") String id) throws ResponseException;

	@RequestLine("GET /v2/groups/{id}")
	Group getGroup(@Param("id") String id) throws ResponseException;

	// Tasks
	@RequestLine("GET /v2/tasks")
	GetTasksResponse getTasks() throws ResponseException;

	@RequestLine("POST /v2/tasks/delete?force={force}&scale={scale}")
	void deleteTasks(TaskIds taskIds, @Param("force") boolean force, @Param("scale") boolean scale)
			throws ResponseException;

	// Deployments
	@RequestLine("GET /v2/deployments")
	List<Deployment> getDeployments() throws ResponseException;

	@RequestLine("DELETE /v2/deployments/{deploymentId}")
	void cancelDeploymentAndRollback(@Param("deploymentId") String id) throws ResponseException;

	@RequestLine("DELETE /v2/deployments/{deploymentId}?force={force}")
	void cancelDeployment(@Param("deploymentId") String id, @Param("force") boolean force) throws ResponseException;

	// Event Subscriptions
	@RequestLine("POST /v2/eventSubscriptions?callbackUrl={url}")
	GetEventSubscriptionRegisterResponse register(@Param("url") String url) throws ResponseException;

	@RequestLine("DELETE /v2/eventSubscriptions?callbackUrl={url}")
	GetEventSubscriptionRegisterResponse unregister(@Param("url") String url) throws ResponseException;

	@RequestLine("GET /v2/eventSubscriptions")
	GetEventSubscriptionsResponse subscriptions() throws ResponseException;

	// Queue
	@RequestLine("GET /v2/queue")
	QueueResponse getQueue() throws ResponseException;

	/**
	 * @method delayQueue(如果应用程序在指定的时间内失败太多（根据应用程序定义），任务启动将被延迟。这个延迟可以通过调用这个端点移除
	 *         。效果是，该应用程序的任务将立即启动)
	 * @return QueueResponse
	 * @author 张海阳
	 * @date 2017年6月8日 下午7:22:07
	 */
	@RequestLine("DELETE /v2/queue/{app_id}/delay")
	void delayQueue(@Param("id") String id) throws ResponseException;

	// Server Info
	@RequestLine("GET /v2/info")
	GetServerInfoResponse getServerInfo() throws ResponseException;

	// Miscellaneous

}
