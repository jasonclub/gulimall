package com.atguigu.gulimall.menber.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.menber.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author Jason
 * @email jason_team@163.com
 * @date 2022-05-29 18:22:45
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

