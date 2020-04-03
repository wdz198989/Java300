package 设计模式.template.implove;

public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        // 空实现

    }

    @Override
    boolean customerWantAddCondiments(){
        return  false;
    }
}
