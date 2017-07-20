package com.dataman.mapper.app;

import com.dataman.model.app.Accounts;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author likai
 * @ClassName: AccountsMapper
 * @Description:
 * @date 2017-07-19 上午10:23
 * @Copyright © 2017北京数人科技有限公司
 */

@Component
@Mapper
public interface AccountsMapper {

    List<Accounts>  findAll();
}
