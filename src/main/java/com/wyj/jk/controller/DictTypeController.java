package com.wyj.jk.controller;

import com.wyj.jk.pojo.po.DictType;
import com.wyj.jk.pojo.query.DictTypeQuery;
import com.wyj.jk.service.DictTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String list(DictTypeQuery query, Model model) {
        dictTypeService.list(query);
        model.addAttribute("query", query);
        return "pages/dictType";
    }

}
