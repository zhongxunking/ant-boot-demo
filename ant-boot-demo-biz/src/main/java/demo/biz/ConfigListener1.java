///*
// * 作者：钟勋 (e-mail:zhongxunking@163.com)
// */
//
///*
// * 修订记录:
// * @author 钟勋 2017-10-05 19:03 创建
// */
//package demo.biz;
//
//import org.antframework.common.util.tostring.ToString;
//import org.antframework.configcenter.client.core.ChangedProperty;
//import org.antframework.configcenter.spring.context.Contexts;
//import org.antframework.configcenter.spring.listener.annotation.ConfigListener;
//import org.antframework.configcenter.spring.listener.annotation.ListenConfigChanged;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.List;
//
///**
// *
// */
//@ConfigListener
//public class ConfigListener1 {
//    private static final Logger logger = LoggerFactory.getLogger(ConfigListener1.class);
//
//    @ListenConfigChanged(prefix = "pool")
//    public void listenPool(List<ChangedProperty> changedProperties) {
//        logger.info("监听到应用[{}]的pool配置被修改：{}", Contexts.getAppId(), ToString.toString(changedProperties));
//    }
//
//    @ListenConfigChanged(prefix = "pool.max")
//    public void listenPoolMax(ChangedProperty changedProperty) {
//        logger.info("监听到应用[{}]的pool.max配置被修改：{}", Contexts.getAppId(), changedProperty);
//    }
//
//    @ListenConfigChanged(prefix = "")
//    public void listenAll(List<ChangedProperty> changedProperties) {
//        logger.info("监听到应用[{}]的配置被修改：{}", Contexts.getAppId(), ToString.toString(changedProperties));
//    }
//}
