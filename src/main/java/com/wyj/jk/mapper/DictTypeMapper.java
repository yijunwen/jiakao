package com.wyj.jk.mapper;

import com.wyj.jk.pojo.po.DictType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author wen.yijun
 * @Description
 * @date 2020/12/7
 */
public interface DictTypeMapper {
    @Select("SELECT id, name, value, intro FROM dict_type")
    List<DictType> list();
}
