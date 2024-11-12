package top.hyzhu.web.sys_user.entity;

import lombok.Data;
/**
 * @Author: zhy
 * @Description: UpdatePasswordParm
 * @Date: 2024-11-11 19:36
 **/
@Data
public class UpdatePasswordParm {
    private Long userId;
    private String oldPassword;
    private String password;
}
