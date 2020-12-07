package com.wyj.jk.service.impl;

import com.wyj.jk.mapper.DictTypeMapper;
import com.wyj.jk.pojo.po.DictType;
import com.wyj.jk.service.DictTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wen.yijun
 * @Description
 * @date 2020/12/7
 */
@Service
public class DictTypeServiceImpl implements DictTypeService {

    @Autowired
    DictTypeMapper dictTypeMapper;

    @Override
    public List<DictType> list() {
        return dictTypeMapper.list();
    }
}
