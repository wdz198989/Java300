package ifElse的替代方案.曾几何时;


/**
 * @Author : WuDazhong
 * @Date :2020/4/2 19:43
 * @Description : 角色判断类
 */
public class JudgeRole {

    public String judge( String roleName ) {
        String result = "";
        if (roleName.equals("ROLE_ROOT_ADMIN")) {
            // 系统管理员有A权限
            result = "ROLE_ROOT_ADMIN: " + "has AAA permission";
        } else if ( roleName.equals("ROLE_ORDER_ADMIN") ) {
            // 订单管理员有B权限
            result = "ROLE_ORDER_ADMIN: " + "has BBB permission";
        } else if ( roleName.equals("ROLE_NORMAL") ) {
            // 普通用户有C权限
            result = "ROLE_NORMAL: " + "has CCC permission";
        } else {
            result = "XXX";
        }
        return result;
    }
}
