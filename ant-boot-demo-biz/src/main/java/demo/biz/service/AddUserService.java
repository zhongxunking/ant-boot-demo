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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.Random;

/**
 *
 */
@Service(enableTx = true)
public class AddUserService {
    private static final Logger logger = LoggerFactory.getLogger(AddUserService.class);
    private Random random = new Random();
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private MyCacheable myCacheable;

    @ServiceExecute
    public void execute(ServiceContext<AddUserOrder, AddUserResult> context) {
        logger.info("接收到添加用户请求：{}", context.getOrder());
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("aaaa.bbbb", "hello myworld" + random.nextInt(1000));
        String aa = (String) valueOperations.get("aaaa.bbbb");

        String userName1 = myCacheable.getUserName("00111111");
        String userName2 = myCacheable.getUserName("00222211");
        String userName3 = myCacheable.getUserName("00333311");

        String userName1_bak = myCacheable.getUserName("00111111");
        String userName2_bak = myCacheable.getUserName("00222211");
        String userName3_bak = myCacheable.getUserName("00333311");
    }
}
