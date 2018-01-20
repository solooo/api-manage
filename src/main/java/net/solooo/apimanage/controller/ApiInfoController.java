package net.solooo.apimanage.controller;

import net.solooo.apimanage.model.ApiInfo;
import net.solooo.apimanage.service.ApiInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Eric on 2018/1/21.
 */
@Controller
@RequestMapping("/apis")
public class ApiInfoController {

    @Autowired
    private ApiInfoService apiInfoService;

    @GetMapping
    @ResponseBody
    public List<ApiInfo> list() {
        return apiInfoService.list();
    }
}
