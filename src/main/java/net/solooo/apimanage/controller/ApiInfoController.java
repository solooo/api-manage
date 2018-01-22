package net.solooo.apimanage.controller;

import net.solooo.apimanage.model.ApiInfo;
import net.solooo.apimanage.service.ApiInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Eric on 2018/1/21.
 */
@Controller
@RequestMapping("/")
public class ApiInfoController {

    @Autowired
    private ApiInfoService apiInfoService;

    @GetMapping
    public ModelAndView list() {
        List<ApiInfo> list = apiInfoService.list();
        return new ModelAndView("messages/list", "messages", list);
    }

    @GetMapping("view")
    public String detail() {

        return "messages/view";
    }
}
