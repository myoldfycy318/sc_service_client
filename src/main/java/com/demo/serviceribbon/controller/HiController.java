package com.demo.serviceribbon.controller;

import com.demo.serviceribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HiController {

    @Autowired
    HiService hiService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return hiService.hiService(name);
    }

}
