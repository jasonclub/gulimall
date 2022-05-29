package com.atguigu.gulimall.menber.dao;

import com.atguigu.gulimall.menber.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author Jason
 * @email jason_team@163.com
 * @date 2022-05-29 18:22:45
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
