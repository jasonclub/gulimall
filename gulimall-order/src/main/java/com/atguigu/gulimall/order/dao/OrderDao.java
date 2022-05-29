package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Jason
 * @email jason_team@163.com
 * @date 2022-05-29 18:35:48
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
