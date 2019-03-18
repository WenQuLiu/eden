package com.star.eden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class EdenApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdenApplication.class, args);
    }

}
