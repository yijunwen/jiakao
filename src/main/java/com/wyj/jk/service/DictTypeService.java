package com.wyj.jk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyj.jk.pojo.po.DictType;
import com.wyj.jk.pojo.query.DictTypeQuery;

import java.util.List;

/**
 * @author wen.yijun
 * @Description
 * @date 2020/12/7
 */
public interface DictTypeService extends IService<DictType> {
    void list(DictTypeQuery query);
}
