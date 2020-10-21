package Interceptor;


/**
 * @Author : WuDazhong
 * @Date :2020/10/21 9:20
 * @Description : 客户端
 * 第 5 步：创建客户端 ClientDemo
 */

/**   通过java实现拦截器的效果
 * 通过这篇文章，我们可能会对拦截器的实现原理有一个更透彻的理解。
 * But，在真正的项目实践之中，要想实现拦截器的功能，我们一般采用
 * 继承类HandlerInterceptorAdapter或者抽象类AbstractInterceptor，
 * 或者实现HandleInterceptor接口。也就是说，我们只需要关心如何重写方法，
 * 而不需要关心其内部的实现原理。
 */

public class ClientDemo {
    public static void main(String args[]) {
        // 创建动态代理处理工具
        DynamicProxyHandler handler = new DynamicProxyHandler();

        // 创建业务组件对象
        BusinessFacade business = new BusinessClass();

        // 创建业务组件对象，并用动态代理绑定代理类
        BusinessFacade businessProxy = (BusinessFacade) handler.bind(business);

        // 调用业务组件中的方法，演示拦截器效果
        businessProxy.doSomething();
    }
}
