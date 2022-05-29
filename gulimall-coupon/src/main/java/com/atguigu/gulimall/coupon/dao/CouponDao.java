package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Jason
 * @email jason_team@163.com
 * @date 2022-05-29 12:33:43
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
