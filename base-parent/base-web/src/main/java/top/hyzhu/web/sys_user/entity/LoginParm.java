package top.hyzhu.web.sys_user.entity;

import lombok.Data;

/**
 * @Author: zhy
 * @Description: LoginParm
 * @Date: 2024-11-11 14:22
 **/

@Data
public class LoginParm {
    private String username;
    private String password;
    private String code;
}
