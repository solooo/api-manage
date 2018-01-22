package net.solooo.apimanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Eric on 2018/1/21.
 */
@Controller
@RequestMapping("/sample")
public class SimpleController {

    @GetMapping("/")
    @ResponseBody
    public String home() {

        return "index, hello";
    }
}
