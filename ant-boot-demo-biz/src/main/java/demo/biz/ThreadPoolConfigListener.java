/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-10-05 19:03 创建
 */
package demo.biz;

import org.antframework.boot.config.listener.annotation.ConfigListener;
import org.antframework.boot.config.listener.annotation.ListenConfigChanged;
import org.antframework.common.util.tostring.ToString;
import org.antframework.configcenter.client.core.ChangedProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 *
 */
@ConfigListener
public class ThreadPoolConfigListener {
    private static final Logger logger = LoggerFactory.getLogger(ThreadPoolConfigListener.class);

    @ListenConfigChanged(prefix = "pool")
    public void listenPool(List<ChangedProperty> changedProperties) {
        logger.info("监听到线程池配置被修改：" + ToString.toString(changedProperties));
    }

    @ListenConfigChanged(prefix = "pool.max")
    public void listenPoolMax(List<ChangedProperty> changedProperties) {
        logger.info("监听到线程池最大配置被修改：" + ToString.toString(changedProperties));
    }

    @ListenConfigChanged(prefix = "")
    public void listenAll(List<ChangedProperty> changedProperties) {
        logger.info("监听到有配置被修改：" + ToString.toString(changedProperties));
    }
}
