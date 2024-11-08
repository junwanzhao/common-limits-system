package top.hyzhu.result;

/**
 * @Author: zhy
 * @Description: StatusCode
 * @Date: 2024-11-08 15:04
 **/
public interface StatusCode {
    //返回成功
    int SUCCESS_CODE = 200;
    //错误状态码
    int ERROR_CODE = 500;
    //⽆权限
    int NO_LOGIN = 600;
    int NO_AUTH = 700;
}
