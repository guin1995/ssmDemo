package com.demo.controller;

import com.demo.pojo.Dynasty;
import com.demo.service.DynastyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/dynasty")
public class DynastyController {

    @Autowired
    private DynastyService dynastyService;

    @RequestMapping("/select/{id}")
    @ResponseBody
    private Dynasty select(@PathVariable Long id) throws Exception{
        Dynasty dy = dynastyService.getById(id);
        return dy;
    }

    @RequestMapping("/input")
    private String input(@RequestParam(value = "id",required = false) Long id,Model model) throws Exception{
        if(id!=null){
            Dynasty dy = dynastyService.getById(id);
            model.addAttribute("dynasty",dy);
        }
        return "dynasty/dynasty-input";
    }
}
