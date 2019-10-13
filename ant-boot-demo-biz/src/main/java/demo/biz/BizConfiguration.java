/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-06-22 13:00 创建
 */
package demo.biz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * biz层配置
 */
@Configuration
public class BizConfiguration {
    @Value("${aa:${aa2:abc}}")
    private String aa;

    @Value("${bb}")
    public void setBb(int bb) {
        int b = bb;
    }

}
