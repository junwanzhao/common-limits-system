package top.hyzhu.web.sys_user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.hyzhu.web.sys_menu.entity.AssignTreeParm;
import top.hyzhu.web.sys_menu.entity.AssignTreeVo;
import top.hyzhu.web.sys_user.entity.SysUser;

/**
 * @Author: zhy
 * @Description: SysUserService
 * @Date: 2024-11-09 19:20
 **/
public interface SysUserService extends IService<SysUser> {
    //新增
    void saveUser(SysUser sysUser);
    //编辑
    void editUser(SysUser sysUser);
    //删除⽤户
    void deleteUser(Long userId);
    //查询菜单树
    AssignTreeVo getAssignTree(AssignTreeParm parm);
}
