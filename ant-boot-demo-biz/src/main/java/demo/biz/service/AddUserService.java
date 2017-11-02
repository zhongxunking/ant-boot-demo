/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-11-02 22:15 创建
 */
package demo.biz.service;

import demo.facade.order.AddUserOrder;
import demo.facade.result.AddUserResult;
import org.bekit.service.annotation.service.Service;
import org.bekit.service.annotation.service.ServiceExecute;
import org.bekit.service.engine.ServiceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
@Service(enableTx = true)
public class AddUserService {
    private static final Logger logger = LoggerFactory.getLogger(AddUserService.class);

    @ServiceExecute
    public void execute(ServiceContext<AddUserOrder, AddUserResult> context) {
        logger.info("接收到添加用户请求：{}", context.getOrder());
    }
}
