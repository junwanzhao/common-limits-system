package top.hyzhu.web.sys_menu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.hyzhu.web.sys_menu.entity.SysMenu;
import org.apache.ibatis.annotations.Param;
import java.util.List;
/**
 * @Author: zhy
 * @Description: SysMenuMapper
 * @Date: 2024-11-10 15:43
 **/
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    //根据⽤户id查询菜单
    List<SysMenu> getMenuByUserId(@Param("userId") Long userId);

    //根据⻆⾊id查询菜单
    List<SysMenu> getMenuByRoleId(@Param("roleId") Long roleId);
}