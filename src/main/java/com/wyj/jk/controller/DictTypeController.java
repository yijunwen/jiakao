package com.wyj.jk.controller;

import com.wyj.jk.pojo.po.DictType;
import com.wyj.jk.service.DictTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wen.yijun
 * @Description
 * @date 2020/12/7
 */

@Controller
@RequestMapping("/dictTypes")
public class DictTypeController {

    @Autowired
    DictTypeService dictTypeService;

    @GetMapping("/list")
    @ResponseBody
    public List<DictType> list(){
        return dictTypeService.list();
    }

}
