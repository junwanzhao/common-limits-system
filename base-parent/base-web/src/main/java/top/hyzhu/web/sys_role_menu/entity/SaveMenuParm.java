package top.hyzhu.web.sys_role_menu.entity;

import lombok.Data;

import java.util.List;

/**
 * @Author: zhy
 * @Description: SaveMenuParm
 * @Date: 2024-11-11 16:42
 **/

@Data
public class SaveMenuParm {
    private Long roleId;
    private List<Long> list;
}