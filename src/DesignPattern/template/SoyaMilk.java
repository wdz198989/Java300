package DesignPattern.template;
// 抽象类，表示豆浆
public abstract class SoyaMilk {
    // 模板方法，定义成final，防止子类覆盖
    final void make(){
      select();;
      addCondiments();
      soak();
      beat();
    }
    // 选材料
     void select(){
         System.out.println("第一步：选择好的黄豆");
     }
     //添加不同配料，抽象方法，子类去实现
    abstract  void addCondiments();
    // 浸泡
    void soak(){
        System.out.println("第三步:浸泡");
    }
    // 打浆
    void beat(){
        System.out.println("第四步：打浆");
    }
}
