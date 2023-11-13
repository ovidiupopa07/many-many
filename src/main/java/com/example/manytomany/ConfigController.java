package com.example.manytomany;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ConfigController {

    private final ConfigService service;

    public ConfigController(ConfigService service) {
        this.service = service;
    }

    @PostMapping
    @RequestMapping("/config/{test}")
    String test(@PathVariable boolean test) {


        service.save(test);
        return "OK";
    }
}
