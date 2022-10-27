package com.woniu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class LoggerController {
    private static final Logger logger = LoggerFactory.getLogger(LoggerController.class);
    // 2. 打印日志
    @RequestMapping("/logger")
    public String logger(){
        logger.trace("日志级别: trace");
        logger.debug("日志级别: degue");
        logger.info("日志级别: info");
        logger.warn("日志级别: warn");
        logger.error("日志级别: error");
        return "logger";
    }
}
