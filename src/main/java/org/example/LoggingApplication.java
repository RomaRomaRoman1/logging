package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class LoggingApplication
{
    private static final Logger LOGGER = LogManager.getLogger(LoggingApplication.class);
    private static void loggerDemo() throws InterruptedException {
        for(int i=0; i<300; i++) {
            LOGGER.debug("test 1 - debug level");
            LOGGER.warn("test 2 - warn level");
            LOGGER.info("test 1 - info level");
            Thread.sleep(100);
        }

    }


    public static void main( String[] args ) throws InterruptedException {
        SpringApplication.run(LoggingApplication.class, args);
       loggerDemo();
    }


}
