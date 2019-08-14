package com.jiem.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello Docker
 *
 * @author: haojunjie
 * @date: 2019/8/14 15:00
 */
@RestController
public class MainController {

    static Log log = LogFactory.getLog(MainController.class);

    @RequestMapping("/")
    public String index() {
        log.info("Hello Docker!");
        return "Hello Docker!";
    }
}
