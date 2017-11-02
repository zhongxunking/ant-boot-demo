/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-11-02 22:06 创建
 */
package demo.facade.api;

import demo.facade.order.AddUserOrder;
import demo.facade.result.AddUserResult;

/**
 *
 */
public interface UserService {

    AddUserResult addUser(AddUserOrder order);
}
