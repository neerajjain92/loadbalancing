package com.neeraj.loadbalancing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Landing Page Controller.
 *
 * @author neeraj on 24/06/20
 * Copyright (c) 2019, loadbalancing.
 * All rights reserved.
 */
@RestController
@Slf4j
public class HelloController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/hello")
    public String welcome() throws InterruptedException {
        log.info("HelloController Invoked @port --> {}", serverPort);
        Thread.sleep(500);
        return "Hello World from LoadBalancing Application @port --> " + serverPort;
    }
}
