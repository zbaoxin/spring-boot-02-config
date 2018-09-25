package com.github.zbaoxin.springboot02config.config;

import com.github.zbaoxin.springboot02config.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.lang.System.out;

/**
 * @Configuration： 指明当前类是一个配置类，就是来替代之前的Spring配置文件
 * 在配置文件中使用<bean></bean>标签添加组件
 */

@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中，容器中这个组件默认的ID为方法名称
    @Bean
    public HelloService helloService02()
    {
        out.println("配置类@Bean给容器中添加组件了");
        return new HelloService();
    }
}
