package com.atguigu.oss;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;




/**
 * Description:
 * Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.
 *
 * Reason: Failed to determine a suitable driver class
 *
 * Action:
 * Consider the following:
 * 	If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.
 * 	If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).
 */

/**
 * @author Administrator
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //取消数据库的自动配置，防止去加载数据库属性，找不到而报错
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.atguigu"})
public class OssApplication {

    public static void main(String[] args) {
        SpringApplication.run(OssApplication.class, args);
    }
}
