package 多线程.静态代理;


/**
 * @Author : WuDazhong
 * @Date :2020/8/9 21:40
 * @Description : 静态代理
 */
public class StaticProxy {

    public static void main(String[] args) {
        //WeddingCompany weddingCompany = new WeddingCompany(new You());
        //weddingCompany.HappyMarry();
        //等价于下面（类比于多线程）
        new WeddingCompany(new You()).HappyMarry();
        new Thread(() -> System.out.println("我爱你")).start();
    }
}

interface Marry{
    void HappyMarry();
}

//真实角色
class You implements Marry{

    @Override
    public void HappyMarry() {
        System.out.println("张三要结婚了");
    }
}
//代理角色
class WeddingCompany implements Marry{

    private Marry target;

    public WeddingCompany(Marry target){
     this.target=target;
    }

    @Override
    public void HappyMarry() {

        before();
        this.target.HappyMarry();
        after();

    }

    private void after() {
        System.out.println("结婚之后的工作");
    }

    private void before() {

        System.out.println("结婚之前的准备工作");
    }
}
