package org.lan.config;

import jakarta.annotation.Resource;
import jakarta.servlet.Servlet;
import org.lan.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig{
    @Resource(name = "myServlet")
    MyServlet myServlet;

    @Bean
    public ServletRegistrationBean<Servlet> servletRegistrationBean() {
        //return new ServletRegistrationBean<>(myServlet, "/servletTest");
        ServletRegistrationBean<Servlet> bean = new ServletRegistrationBean<>();
        bean.setServlet(myServlet);
        bean.addUrlMappings("/login","/servlet");
        return bean;
    }
}
