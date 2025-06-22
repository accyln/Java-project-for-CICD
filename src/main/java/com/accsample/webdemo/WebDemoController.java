package com.accsample.webdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/test")
public class WebDemoController {

    @GetMapping({"/acc"})
    public String index() {
        return "Hello world!";
    }
}
