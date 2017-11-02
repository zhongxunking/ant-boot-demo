/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-11-02 22:13 创建
 */
package demo.biz.provider;

import com.alibaba.dubbo.config.annotation.Service;
import demo.facade.api.UserService;
import demo.facade.order.AddUserOrder;
import demo.facade.result.AddUserResult;
import org.bekit.service.ServiceEngine;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 */
@Service(group = "demo", version = "1.0")
public class UserServiceProvider implements UserService {
    @Autowired
    private ServiceEngine serviceEngine;

    @Override
    public AddUserResult addUser(AddUserOrder order) {
        return serviceEngine.execute("addUserService", order);
    }
}
