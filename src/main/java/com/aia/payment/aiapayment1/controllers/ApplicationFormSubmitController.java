package com.aia.payment.aiapayment1.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path = "/aiapayment1")
public class ApplicationFormSubmitController {


    /**
     * logger defined to log the message in the class.
     */
    private static final Logger LOG = LoggerFactory.getLogger(ApplicationFormSubmitController.class);


    @GetMapping(value = "basic")
    public String getName()
    {
        return "SHIVANI";
    }

    }
