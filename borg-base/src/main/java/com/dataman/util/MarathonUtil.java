package com.dataman.util;

import com.dataman.marathon.Marathon;
import com.dataman.marathon.MarathonClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MarathonUtil
 * @Description: TODO(马拉松工具类)
 * @author 张海阳
 * @date 2017年6月1日 下午12:02:23
 * @Copyright © 2017北京数人科技有限公司
 */
@Component("marathonUtil")
public class MarathonUtil {

	@Value("${marathon.address}")
	private String marathonEndpoint;

	/**
	 * @method getInstance(获取marathon服务接口的实例)
	 * @return Marathon
	 * @author 张海阳
	 * @date 2017年6月1日 下午12:02:43
	 */
	public Marathon getInstance() {

		return MarathonClient.getInstance(marathonEndpoint);
	}

}
