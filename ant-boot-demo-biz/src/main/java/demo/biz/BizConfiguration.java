/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-06-22 13:00 创建
 */
package demo.biz;

import org.antframework.configcenter.spring.ConfigContexts;
import org.antframework.ids.UID;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * biz层配置
 */
@Configuration
public class BizConfiguration {

    @PostConstruct
    public void init() {
        String id = UID.newId();
        ConfigContexts.getConfig("common");
    }
}
