/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-06-22 11:34 创建
 */
package demo;

import org.antframework.boot.core.AntBootApplication;
import org.antframework.boot.core.Apps;
import org.springframework.boot.SpringApplication;

/**
 * 程序启动入口
 */
@AntBootApplication(appCode = "ant-boot-demo")
public class Main {
    public static void main(String[] args) {
        String baseDir=System.getProperty("user.home")+"/var";
        System.setProperty("app.config-path", baseDir+"/config/ant-boot-demo");
        System.setProperty("app.data-path", baseDir+"/data/ant-boot-demo");
        System.setProperty("app.log-path", baseDir+"/log/ant-boot-demo");
        Apps.setProfileIfNotExists("dev");
        SpringApplication.run(Main.class, args);
    }
}
