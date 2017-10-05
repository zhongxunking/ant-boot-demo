/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-10-05 19:03 创建
 */
package demo.biz;

import org.antframework.common.util.tostring.ToString;
import org.antframework.configcenter.client.core.ModifiedProperty;
import org.antframework.configcenter.client.spring.listener.annotation.ConfigListener;
import org.antframework.configcenter.client.spring.listener.annotation.ListenConfigModified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 *
 */
@ConfigListener
public class ThreadPoolConfigListener {
    private static final Logger logger = LoggerFactory.getLogger(ThreadPoolConfigListener.class);

    @ListenConfigModified(prefix = "pool")
    public void listenPool(List<ModifiedProperty> modifiedProperties) {
        logger.info("监听到线程池配置被修改：" + ToString.toString(modifiedProperties));
    }

    @ListenConfigModified(prefix = "pool.max")
    public void listenPoolMax(List<ModifiedProperty> modifiedProperties) {
        logger.info("监听到线程池最大配置被修改：" + ToString.toString(modifiedProperties));
    }
}
