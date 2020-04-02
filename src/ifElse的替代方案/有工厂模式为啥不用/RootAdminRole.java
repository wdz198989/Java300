package ifElse的替代方案.有工厂模式为啥不用;


/**
 * @Author : WuDazhong
 * @Date :2020/4/2 19:53
 * @Description : 系统管理员（有操作A的权限）
 */
public class RootAdminRole  implements  RoleOperation{
    private  String roleName;

    public RootAdminRole(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String op() {
        return roleName+"has AAA permission";
    }
}
