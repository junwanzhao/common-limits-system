package top.hyzhu.web.sys_role.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.hyzhu.web.sys_role.entity.SysRole;
import top.hyzhu.web.sys_role.mapper.SysRoleMapper;
import top.hyzhu.web.sys_role.service.SysRoleService;

/**
 * @Author: zhy
 * @Description: SysRoleServiceImpl
 * @Date: 2024-11-08 15:26
 **/

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService { }
