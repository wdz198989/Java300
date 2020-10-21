package Interceptor;


/**
 * @Author : WuDazhong
 * @Date :2020/10/21 9:16
 * @Description :
 */
/**
 * @author 维C果糖
 * @create 2017-03-30
 *
 * GitHub：github.com/guobinhit
 *   第 2步：创建业务组件实现类 BusinessClass
 * 业务组件接口的实现类
 */
public class BusinessClass implements BusinessFacade {
    @Override
    public void doSomething() {
        System.out.println("在业务组件 BusinessClass 中调用方法: doSomething()");
    }
}
