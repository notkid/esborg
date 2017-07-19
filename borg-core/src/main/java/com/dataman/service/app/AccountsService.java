package com.dataman.service.app;

import com.dataman.mapper.app.AccountsMapper;
import com.dataman.moudel.app.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author likai
 * @ClassName: Accounts
 * @Description:
 * @date 2017-07-19 上午10:16
 * @Copyright © 2017北京数人科技有限公司
 */

@Service
public class AccountsService {

    @Autowired
    private AccountsMapper accountsMapper;

    public List<Accounts> getAccounts(){

        return accountsMapper.findAll();
    }
}
