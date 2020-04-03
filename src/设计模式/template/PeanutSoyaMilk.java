package 设计模式.template;

public class PeanutSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("第二步：加入上好的花生");
    }

   /* @Override
    void soak() {
        System.out.println("第三步：花生拨开再浸泡");
    }*/
}
