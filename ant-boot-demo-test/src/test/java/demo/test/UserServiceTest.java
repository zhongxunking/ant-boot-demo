/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-11-04 00:58 创建
 */
package demo.test;

import com.alibaba.dubbo.config.annotation.Reference;
import demo.facade.api.UserService;
import demo.facade.order.AddUserOrder;
import demo.facade.result.AddUserResult;
import org.antframework.common.util.facade.Status;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class UserServiceTest extends AbstractTest {
    @Reference(group = "demo", version = "1.0")
    private UserService userService;

    @Test
    public void testAddUser() throws InterruptedException {
        Thread.sleep(5000);
        AddUserOrder order = new AddUserOrder();
        order.setName("钟勋");
        order.setAge(26);
        order.setAddress("上海普陀");
        AddUserResult result = userService.addUser(order);
        Assert.assertEquals(Status.SUCCESS, result.getStatus());
    }
}
