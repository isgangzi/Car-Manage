package com.CarManage.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//            registry.addResourceHandler("/assets/**") .addResourceLocations("classpath:/assets/");
//            registry.addResourceHandler("/css/**") .addResourceLocations("classpath:/css/");
//            registry.addResourceHandler("/fonts/**") .addResourceLocations("classpath:/fonts/");
//            registry.addResourceHandler("/image/**") .addResourceLocations("classpath:/image/");
//            registry.addResourceHandler("/images/**") .addResourceLocations("classpath:/images/");
//            registry.addResourceHandler("/js/**") .addResourceLocations("classpath:/js/");
//            registry.addResourceHandler("/media/**") .addResourceLocations("classpath:/media/");
//            registry.addResourceHandler("/pageJS/**") .addResourceLocations("classpath:/pageJS/");
    }
}
