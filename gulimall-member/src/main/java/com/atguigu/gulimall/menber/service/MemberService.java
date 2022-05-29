package com.atguigu.gulimall.menber.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.menber.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Jason
 * @email jason_team@163.com
 * @date 2022-05-29 18:22:45
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

