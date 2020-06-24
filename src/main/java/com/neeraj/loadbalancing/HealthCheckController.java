package com.neeraj.loadbalancing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller providing Application HeartBeat.
 *
 * @author neeraj on 24/06/20
 * Copyright (c) 2019, loadbalancing.
 * All rights reserved.
 */
@RestController
@Slf4j
public class HealthCheckController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/health")
    public String health() {
        log.info("Health Check received @ --> {}", serverPort);
        return "I am healthy @ " + serverPort;
    }
}
