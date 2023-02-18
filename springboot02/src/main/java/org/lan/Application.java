package org.lan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = {"org.lan.mapper"})
public class Application {

    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }
}
