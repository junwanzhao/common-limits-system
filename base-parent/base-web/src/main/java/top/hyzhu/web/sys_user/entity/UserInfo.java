package top.hyzhu.web.sys_user.entity;

import lombok.Data;
/**
 * @Author: zhy
 * @Description: UserInfo
 * @Date: 2024-11-12 8:01
 **/

@Data
public class UserInfo {
    private Long userId;
    private String name;
    private Object[] permissions;
}