package com.microsamples.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xnovm on 02.12.2017.
 */
@RestController
public class RootController {

    private final String version = "1.0";

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<String> notes = Arrays.asList("A", "B", "C");
        modelAndView.addObject("notes", notes);
        return modelAndView;
    }

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
