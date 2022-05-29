package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author Jason
 * @email jason_team@163.com
 * @date 2022-05-29 17:37:59
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
