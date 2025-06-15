package com.spring1.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Test Controller")
public class TestController {

    @Operation(summary = "Say Hello", description = "Returns a greeting message")
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Swagger!";
    }
}
