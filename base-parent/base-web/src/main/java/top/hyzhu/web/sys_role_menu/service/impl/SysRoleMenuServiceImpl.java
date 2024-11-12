package top.hyzhu.web.sys_role_menu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.hyzhu.web.sys_role_menu.entity.SaveMenuParm;
import top.hyzhu.web.sys_role_menu.entity.SysRoleMenu;
import top.hyzhu.web.sys_role_menu.mapper.SysRoleMenuMapper;
import top.hyzhu.web.sys_role_menu.service.SysRoleMenuService;

/**
 * @Author: zhy
 * @Description: SysRoleMenuServiceImpl
 * @Date: 2024-11-11 16:45
 **/
@Service
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements SysRoleMenuService {

    @Override
    @Transactional
    public void saveRoleMenu(SaveMenuParm parm) {
        //先删除
        QueryWrapper<SysRoleMenu> query = new QueryWrapper<>();
        query.lambda().eq(SysRoleMenu::getRoleId, parm.getRoleId());
        this.baseMapper.delete(query);
        //再保存
        this.baseMapper.saveRoleMenu(parm.getRoleId(), parm.getList());
    }
}