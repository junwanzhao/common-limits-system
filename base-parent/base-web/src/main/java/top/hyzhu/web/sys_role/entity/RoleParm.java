package top.hyzhu.web.sys_role.entity;

import lombok.Data;

/**
 * @Author: zhy
 * @Description: RoleParm
 * @Date: 2024-11-08 15:23
 **/
@Data
public class RoleParm {
    private Long currentPage;
    private Long pageSize;
    private String roleName;
}
