package org.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

/**
 * The type Seata springboot app.
 *
 * @Description
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