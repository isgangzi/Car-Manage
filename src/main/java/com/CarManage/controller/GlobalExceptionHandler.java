package com.CarManage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = RuntimeException.class)
    public ModelAndView tipException(Exception e) {
        LOGGER.error("find exception:e={}",e.getMessage());
        e.printStackTrace();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("common/500");//返回自定义渲染页面
        return modelAndView;
    }


    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception e){
        LOGGER.error("find exception:e={}",e.getMessage());
        e.printStackTrace();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("common/404");//返回自定义渲染页面
        return modelAndView;
    }
}
