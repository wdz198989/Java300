package 多线程.MyThread;


/**
 * @Author : WuDazhong
 * @Date :2019/7/11 1:56
 * @Description : 静态代理模式
 * 1、真实角色
 * 2、代理角色： 持有真实角色的引用
 * 3、二者 实现相同的接口
 */
public class StaticProxy {
    public static void main(String[] args) {
        //创建真实角色
        Marry you =new You();
        //创建代理角色 +真实角色的引用
        WeddingCompany company =new WeddingCompany(you);
        //执行任务
        company.marry();

    }

}

//TODO 接口
interface Marry{
    public  abstract void  marry();
}
//TODO 真实角色
class You implements Marry{

    @Override
    public void marry() {
        System.out.println("吴大忠和鲁慧结婚了");
    }
}
//TODO 代理角色
class WeddingCompany implements Marry{

    private Marry you;

    public WeddingCompany() {
    }

    public WeddingCompany(Marry you) {
        this.you = you;
    }
    public void before(){
        System.out.println("准备婚礼");
    }
    public void after(){
        System.out.println("闹洞房");
    }
    @Override
    public void marry() {
        before();
        you.marry();
        after();

    }
}

