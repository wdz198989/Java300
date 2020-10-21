package Interceptor;


/**
 * @Author : WuDazhong
 * @Date :2020/10/21 9:17
 * @Description :
 */
/**
 * @author 维C果糖
 * @create 2017-03-30
 *
 * GitHub：github.com/guobinhit
 * 第 3 步：创建拦截器 InterceptorClass
 * 拦截器
 */
public class InterceptorClass {
    // 在 action 之前调用
    public void before(){
        System.out.println("在拦截器 InterceptorClass 中调用方法: before()");
    }

    // 在 action 之后调用
    public void after(){
        System.out.println("在拦截器 InterceptorClass 中调用方法: after()");
    }
}
