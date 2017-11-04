/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-11-04 20:26 创建
 */
package demo.biz.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class MyCacheable {

    @Cacheable(cacheNames = "myuser", key = "#userId")
    public String getUserName(String userId) {
        switch (userId) {
            case "001":
                return "钟勋001";
            case "002":
                return "钟勋002";
            default:
                return "钟勋other";
        }
    }
}
