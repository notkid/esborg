package com.dataman.service.app;

import com.dataman.model.app.App;
import org.springframework.stereotype.Service;


/**
 * @author likai
 * @ClassName: App
 * @Description:
 * @date 2017-07-18 上午11:38
 * @Copyright © 2017北京数人科技有限公司
 */

@Service
public class AppService {
    public App getApp(){
         App app = new App();
         app.setName("/nginx");
         app.setSize(30);
         app.setType("应用");
         return app;
    }
}
