package com.atguigu.gulimall.menber.dao;

import com.atguigu.gulimall.menber.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author Jason
 * @email jason_team@163.com
 * @date 2022-05-29 18:22:45
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
