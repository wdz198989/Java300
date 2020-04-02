package ifElse的替代方案.策略模式;


/**
 * @Author : WuDazhong
 * @Date :2020/4/2 20:06
 * @Description : 在上面工厂模式代码的基础上，按照策略模式的指导思想，我们也来创建一个所谓的策略上下文类，
 * 这里命名为 RoleContext：
 */
public class RoleContext {
    // 可更换的策略，传入不同的策略对象，业务即响应变化

    private RoleOperation operation;

    public RoleContext(RoleOperation operation) {
        this.operation = operation;
    }

    public String execute(){
        return operation.op();
    }
}
