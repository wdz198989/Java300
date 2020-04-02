package ifElse的替代方案.策略模式;



/**
 * @Author : WuDazhong
 * @Date :2020/4/2 19:57
 * @Description : 普通用户（操作C的权限）
 */
public class NormalRole implements  RoleOperation {
    private  String roleName;

    public NormalRole(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String op() {
        return roleName+"has CCC permission";
    }
}
