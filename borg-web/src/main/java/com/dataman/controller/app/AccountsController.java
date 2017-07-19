package com.dataman.controller.app;

import com.dataman.moudel.app.Accounts;
import com.dataman.service.app.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author likai
 * @ClassName: AccountsController
 * @Description:
 * @date 2017-07-19 上午10:34
 * @Copyright © 2017北京数人科技有限公司
 */


@RestController
@RequestMapping(value = "/account",produces = "application/json;charset=utf-8")
public class AccountsController {

    @Autowired
    private AccountsService accountsService;

    @GetMapping(value = "/accounts")
    public List<Accounts> getAllAccounts(){
        return accountsService.getAccounts();
    }
}
