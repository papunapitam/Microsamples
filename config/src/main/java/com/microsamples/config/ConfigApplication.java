package com.microsamples.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xnovm on 18.06.2017.
 */
@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}

@RestController
class HelloworldController {
    private final String version = "1.0";

    @RequestMapping("/hello/{name}")
    public Map<String, String> hello(@Value("${greeting}") String greetingTemplate, @PathVariable String name) {
        Map<String, String> response = new HashMap<String, String>();

        String greeting = greetingTemplate
                .replaceAll("\\$name", name)
                .replaceAll("\\$version", version);

        response.put("greeting", greeting);
        response.put("version", version);

        return response; 
    }
}