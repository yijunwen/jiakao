package com.wyj.jk.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wyj.jk.mapper.DictTypeMapper;
import com.wyj.jk.pojo.po.DictType;
import com.wyj.jk.pojo.query.DictTypeQuery;
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
public class DictTypeServiceImpl extends ServiceImpl<DictTypeMapper, DictType> implements DictTypeService {
    @Autowired
    private DictTypeMapper mapper;

    @Override
    public void list(DictTypeQuery query) {
        LambdaQueryWrapper<DictType> wrapper = new LambdaQueryWrapper<>();
        String keyword = query.getKeyword();
        if (!StringUtils.isEmpty(keyword)) {
            wrapper.like(DictType::getName, keyword).or()
                    .like(DictType::getValue, keyword).or()
                    .like(DictType::getIntro, keyword);
        }
        //return mapper.selectList(wrapper);
        Page<DictType> page = new Page<>(query.getPage(), query.getSize());
        mapper.selectPage(page, wrapper);
        query.setData(page.getRecords());
        query.setCount(page.getTotal());
        query.setPages(page.getPages());
    }
}
