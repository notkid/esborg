package com.dataman.controller.app;

import com.dataman.controller.base.BaseController;
import com.dataman.model.app.App;
import com.dataman.service.app.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author likai
 * @ClassName: AppController
 * @Description:
 * @date 2017-07-18 下午12:38
 * @Copyright © 2017北京数人科技有限公司
 */

@RestController
@RequestMapping(value = "/app",produces = "application/json;charset=utf-8")
public class AppController extends BaseController {

    @Autowired
    private AppService appService;

    @GetMapping(value = "/app")
    public App getApp(){
         App app = appService.getApp();
        return app;
    }
}
