package com.wyj.jk.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wyj.jk.mapper.DictItemMapper;
import com.wyj.jk.pojo.po.DictItem;
import com.wyj.jk.pojo.query.DictItemQuery;
import com.wyj.jk.service.DictItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wen.yijun
 * @Description
 * @date 2020/12/7
 */
@Service
public class DictItemServiceImpl extends ServiceImpl<DictItemMapper, DictItem> implements DictItemService {
    @Autowired
    private DictItemMapper mapper;

    @Override
    public void list(DictItemQuery query) {
        LambdaQueryWrapper<DictItem> wrapper = new LambdaQueryWrapper<>();
        String keyword = query.getKeyword();
        if (!StringUtils.isEmpty(keyword)) {
            wrapper.like(DictItem::getName, keyword).or()
                    .like(DictItem::getValue, keyword);
        }
        Page<DictItem> page = new Page<>(query.getPage(), query.getSize());
        mapper.selectPage(page, wrapper);
        query.setData(page.getRecords());
        query.setCount(page.getTotal());
        query.setPages(page.getPages());
    }
}
