package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Jason
 * @email jason_team@163.com
 * @date 2022-05-29 17:37:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
