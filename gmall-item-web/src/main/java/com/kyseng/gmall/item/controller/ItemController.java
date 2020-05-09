package com.kyseng.gmall.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kingcrum on 2020/5/7.
 */
@Controller
public class ItemController {
    @RequestMapping("index")
//    @ResponseBody
    public String index(ModelMap modelMap) {
        modelMap.put("hello","hello thymeleaf !!");

        return "index";
    }
}
