package com.wyj.jk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyj.jk.pojo.po.DictItem;
import com.wyj.jk.pojo.query.DictItemQuery;

/**
 * @author wen.yijun
 * @Description
 * @date 2020/12/7
 */
public interface DictItemService extends IService<DictItem> {
    void list(DictItemQuery query);
}
