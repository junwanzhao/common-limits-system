package top.hyzhu.web.sys_user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.hyzhu.web.sys_user.entity.SysUser;
import top.hyzhu.web.sys_user.mapper.SysUserMapper;
import top.hyzhu.web.sys_user.service.SysUserService;
import top.hyzhu.web.sys_user_role.entity.SysUserRole;
import top.hyzhu.web.sys_user_role.service.SysUserRoleService;
import java.util.ArrayList;
import java.util.List;
/**
 * @Author: zhy
 * @Description: SysUserServiceImpl
 * @Date: 2024-11-09 19:20
 **/
@Service
@AllArgsConstructor
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    private final SysUserRoleService sysUserRoleService;

    //插⼊⽤户
    @Transactional
    @Override
    public void saveUser(SysUser sysUser) {
        int i = this.baseMapper.insert(sysUser);
        if (i > 0) {
            String[] split = sysUser.getRoleId().replace("，", ",").split(",");
            List<SysUserRole> roles = new ArrayList<>();
            for (String s : split) {
                SysUserRole userRole = new SysUserRole();
                userRole.setUserId(sysUser.getUserId());
                try {
                    userRole.setRoleId(Long.parseLong(s));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("无效的角色ID格式：" + s);
                }
                roles.add(userRole);
            }
            if (!roles.isEmpty()) {
                sysUserRoleService.saveBatch(roles);
                System.out.println("角色信息已成功保存到 sys_user_role 表：" + roles);
            } else {
                System.out.println("未找到有效的角色信息，未执行保存。");
            }
        }
    }
    //编辑⽤户信息
    @Transactional
    @Override
    public void editUser(SysUser sysUser) {
        int i = this.baseMapper.updateById(sysUser);
        //修改成功后，设置⽤户的⻆⾊
        if (i > 0) {
            //把前端逗号分隔的字符串转为数组
            String[] split = sysUser.getRoleId().split(",");
            //删除⽤户原来的⻆⾊
            QueryWrapper<SysUserRole> query = new QueryWrapper<>();
            query.lambda().eq(SysUserRole::getUserId, sysUser.getUserId());
            sysUserRoleService.remove(query);
            //重新插⼊
            if (split.length > 0) {
                List<SysUserRole> roles = new ArrayList<>();
                for (String s : split) {
                    SysUserRole userRole = new SysUserRole();
                    userRole.setUserId(sysUser.getUserId());
                    userRole.setRoleId(Long.parseLong(s));
                    roles.add(userRole);
                }
                //保存到⽤户⻆⾊表
                sysUserRoleService.saveBatch(roles);
            }
        }
    }

    //删除⽤户
    @Transactional
    @Override
    public void deleteUser(Long userId) {
        int i = this.baseMapper.deleteById(userId);
        if (i > 0) {
            //删除⽤户原来的⻆⾊
            QueryWrapper<SysUserRole> query = new QueryWrapper<>();
            query.lambda().eq(SysUserRole::getUserId, userId);
            sysUserRoleService.remove(query);
        }
    }
}