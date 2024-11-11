package top.hyzhu.web.sys_user.entity;

import lombok.Data;
/**
 * @Author: zhy
 * @Description: LoginVo
 * @Date: 2024-11-11 14:23
 **/

@Data
public class LoginVo {
    private Long userId;
    private String nickName;
    private String token;
}