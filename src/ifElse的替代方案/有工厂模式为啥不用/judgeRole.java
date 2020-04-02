package ifElse的替代方案.有工厂模式为啥不用;


/**
 * @Author : WuDazhong
 * @Date :2020/4/2 20:04
 * @Description : 角色判断
 */
public class judgeRole {
    public String judge( String roleName ) {
        // 一行代码搞定！之前的 if/else也没了！
        return RoleFactory.getOp(roleName).op();
    }
}
