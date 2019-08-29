package org.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

/**
 * The type Seata springboot app.
 *
 * @Description
 */
@EnableDubboConfiguration
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = "org.goods")
//@EnableDiscoveryClient
@MapperScan({"org.goods.mapper"})
@EnableDubbo
public class App {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        LOGGER.info("springboot project with seata starting...");
        SpringApplication.run(App.class, args);
    }
}