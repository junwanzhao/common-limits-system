package top.hyzhu.web.sys_user.entity;

import lombok.Data;
/**
 * @Author: zhy
 * @Description: SelectItem
 * @Date: 2024-11-09 19:53
 **/
@Data
public class SelectItem {
    private Long value;
    private String label;
    private Boolean check;
}