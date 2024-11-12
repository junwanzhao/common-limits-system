package top.hyzhu.web.sys_role_menu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.hyzhu.web.sys_role_menu.entity.SaveMenuParm;
import top.hyzhu.web.sys_role_menu.entity.SysRoleMenu;

/**
 * @Author: zhy
 * @Description: SysRoleMenuService
 * @Date: 2024-11-11 16:45
 **/
public interface SysRoleMenuService extends IService<SysRoleMenu> {
    void saveRoleMenu(SaveMenuParm parm);
}
