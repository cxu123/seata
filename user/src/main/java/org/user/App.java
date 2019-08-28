package org.user;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableDubboConfiguration
@EnableTransactionManagement
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
