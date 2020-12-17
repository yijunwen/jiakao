package com.wyj.jk.controller;

import com.wyj.jk.pojo.query.DictItemQuery;
import com.wyj.jk.service.DictItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wen.yijun
 * @Description
 * @date 2020/12/7
 */

@Controller
@RequestMapping("/dictItems")
public class DictItemController {

    @Autowired
    DictItemService dictItemService;

    @GetMapping("/list")
    public String list(DictItemQuery query, Model model) {
        dictItemService.list(query);
        model.addAttribute("query", query);
        return "pages/dictItem";
    }

}
