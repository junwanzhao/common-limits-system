package top.hyzhu.web.sys_user_role.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import top.hyzhu.web.sys_user_role.entity.SysUserRole;

import java.util.List;

/**
 * @Author: zhy
 * @Description: SysUserRoleService
 * @Date: 2024-11-09 20:16
 **/
public interface SysUserRoleService {
    void saveBatch(List<SysUserRole> roles);

    void remove(QueryWrapper<SysUserRole> query);
}
