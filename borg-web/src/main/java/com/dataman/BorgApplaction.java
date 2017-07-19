package com.dataman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author likai
 * @ClassName: BorgApplaction
 * @Description:
 * @date 2017-07-18 下午12:42
 * @Copyright © 2017北京数人科技有限公司
 */

@SpringBootApplication
@ComponentScan
public class BorgApplaction {

    public static void main(String[] args) {
        SpringApplication.run(BorgApplaction.class, args);
    }
}
