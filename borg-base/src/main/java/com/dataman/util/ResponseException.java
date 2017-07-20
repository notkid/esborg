package com.dataman.util;

/**
 * @ClassName: ResponseException
 * @Description: TODO(Mesos，Marathon接口调用异常处理)
 * @author 张海阳
 * @date 2017年6月13日 上午10:21:19
 * @Copyright © 2017北京数人科技有限公司
 */
public class ResponseException extends Exception {

	private static final long serialVersionUID = 1L;

	private int status;

	private String message;

	public ResponseException(int status, String message) {
		this.status = status;
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message + " (http status: " + status + ")";
	}

	@Override
	public String toString() {
		return message + " (http status: " + status + ")";
	}

}
