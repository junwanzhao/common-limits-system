package top.hyzhu.result;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-11-08 15:05
 **/

@Data
@AllArgsConstructor
public class ResultVo<T> {
    private String msg;
    private int code;
    private T data;
}
