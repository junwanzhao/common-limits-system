package top.hyzhu.web.sys_user_role.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.hyzhu.web.sys_user_role.entity.SysUserRole;
import top.hyzhu.web.sys_user_role.mapper.SysUserRoleMapper;
import top.hyzhu.web.sys_user_role.service.SysUserRoleService;

import java.util.List;

/**
 * @Author: zhy
 * @Description: SysUserRoleServiceImpl
 * @Date: 2024-11-09 20:17
 **/
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRoleService {
    @Override
    public void saveBatch(List<SysUserRole> roles) {
        // 调用父类的 saveBatch 方法实现批量插入
        super.saveBatch(roles);
    }

    @Override
    public void remove(QueryWrapper<SysUserRole> query) {
        // 调用 remove 方法删除符合条件的记录
        super.remove(query);
    }

    @Override
    public List<SysUserRole> list(QueryWrapper<SysUserRole> query) {
        // 调用父类的 list 方法查询符合条件的 SysUserRole 列表
        return super.list(query);
    }
}
