package ifElse的替代方案.策略模式;



/**
 * @Author : WuDazhong
 * @Date :2020/4/2 19:56
 * @Description : 订单管理员（操作B的权限）
 */
public class OrderAdminRole  implements RoleOperation{
    private  String roleName;

    public OrderAdminRole (String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String op() {
        return roleName+"has BBB permission";
    }
}
