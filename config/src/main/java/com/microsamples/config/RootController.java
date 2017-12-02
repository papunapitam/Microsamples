package com.microsamples.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Created by xnovm on 02.12.2017.
 */
@Controller
public class RootController {

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<String> notes = Arrays.asList("A", "B", "C");
        modelAndView.addObject("notes", notes);
        return modelAndView;
    }
}
