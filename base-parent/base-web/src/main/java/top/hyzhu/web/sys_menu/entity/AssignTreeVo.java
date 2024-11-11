package top.hyzhu.web.sys_menu.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhy
 * @Description: AssignTreeVo
 * @Date: 2024-11-11 16:19
 **/

@Data
public class AssignTreeVo {
    private List<SysMenu> menuList = new ArrayList<>();
    private Object[] checkList;
}
