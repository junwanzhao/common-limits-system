package top.hyzhu.web.sys_user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.hyzhu.web.sys_user.entity.SysUser;
import top.hyzhu.web.sys_user.mapper.SysUserMapper;
import top.hyzhu.web.sys_user.service.SysUserService;

/**
 * @Author: zhy
 * @Description: SysUserServiceImpl
 * @Date: 2024-11-09 19:20
 **/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
}