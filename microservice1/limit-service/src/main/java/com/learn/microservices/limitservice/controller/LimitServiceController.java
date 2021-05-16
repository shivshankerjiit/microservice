package com.learn.microservices.limitservice.controller;

import com.learn.microservices.limitservice.beans.Limit;
import com.learn.microservices.limitservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitServiceController {

    @Autowired
    Configuration configuration;

    @GetMapping(value="limits")
    public Limit getLimits(){
        return new Limit(configuration.getMinimum(), configuration.getMaximum());
        //return new Limit(1,100);
    }


}
