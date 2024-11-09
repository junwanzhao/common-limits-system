package top.hyzhu.web.sys_user.entity;

import lombok.Data;

/**
 * @Author: zhy
 * @Description: SysUserPage
 * @Date: 2024-11-09 19:13
 **/
@Data
public class SysUserPage {
    private String phone;
    private String nickName;
    //当前第⼏⻚
    private Long currentPage;
    //没有查询的条数
    private Long pageSize;
}
