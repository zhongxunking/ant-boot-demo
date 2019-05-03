/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-11-02 22:08 创建
 */
package demo.facade.order;

import org.antframework.common.util.facade.AbstractOrder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 *
 */
public class AddUserOrder extends AbstractOrder {
    @NotBlank
    private String name;
    @Min(1)
    private int age;
    @NotBlank
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
