package top.hyzhu.web.sys_menu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.hyzhu.web.sys_menu.entity.SysMenu;

import java.util.List;

/**
 * @Author: zhy
 * @Description: SysMenuService
 * @Date: 2024-11-10 15:45
 **/
public interface SysMenuService extends IService<SysMenu> {
    List<SysMenu> getParent();

    //根据⽤户id查询菜单
    List<SysMenu> getMenuByUserId(Long userId);
    //根据⻆⾊id查询菜单
    List<SysMenu> getMenuByRoleId(Long roleId);
}
