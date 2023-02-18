package org.lan.config;

import jakarta.annotation.Resource;
import jakarta.servlet.Filter;
import org.lan.filtet.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Resource(name = "myFilter")
    MyFilter myFilter;

    @Bean
    public FilterRegistrationBean<Filter> filterFilterRegistrationBean() {
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        bean.setFilter(myFilter);
        bean.addUrlPatterns("/user/*");
        return bean;
    }
}
