package org.cuong.restapidemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/home")
public class HomeController {

    @GetMapping({"/", ""})
    public String home() {
        return "Hello World";
    }

    @GetMapping("/strings")
    public List<String> geStrings() {
        return List.of("ana", "topson", "ceb", "jerax", "notail");
    }
}
