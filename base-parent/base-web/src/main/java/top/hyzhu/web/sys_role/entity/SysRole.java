package top.hyzhu.web.sys_role.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.time.LocalDateTime;
/**
 * @Author: zhy
 * @Description: SysRole
 * @Date: 2024-11-08 15:21
 **/
@Data
@TableName("sys_role")
public class SysRole {
    @TableId(type = IdType.AUTO)
    private Long roleId;
    private String roleName;
    private String remark;
    private String type;
    // 逻辑删除字段
    @TableLogic
    private Integer deleted;
    // ⾃动填充创建时间
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    // ⾃动填充更新时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
