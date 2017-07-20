package com.dataman.marathon;

import com.dataman.marathon.model.v2.App;
import com.dataman.marathon.model.v2.GetAppsResponse;
import com.dataman.util.MarathonUtil;
import com.dataman.util.ResponseException;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * @author likai
 * @ClassName: MarathonTest
 * @Description:
 * @date 2017-07-20 上午9:32
 * @Copyright © 2017北京数人科技有限公司
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MarathonUtil.class)
@WebAppConfiguration
public class MarathonTest {

    protected org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MarathonUtil marathonUtil;

    @Test
    public void getApps() {
        try {
            GetAppsResponse apps = marathonUtil.getInstance().getApps();
            List<App> appList = apps.getApps();
            logger.info(appList.toString());
            System.out.println(appList);
        } catch (ResponseException e) {
            logger.info("marathon fail" + e.getMessage(),e);
        }
    }
}
