package ifElse的替代方案.有工厂模式为啥不用;


import java.util.HashMap;
import java.util.Map;

/**
 * @Author : WuDazhong
 * @Date :2020/4/2 19:59
 * @Description : 工厂类
 */
public class RoleFactory {

    static Map<String,RoleOperation> roleOperationMap=new HashMap<>();
    //在静态块中先把初始化工作完成
    static {
        roleOperationMap.put("ROLE_ROOT_ADMIN",new RootAdminRole("ROLE_ROOT_ADMIN"));
        roleOperationMap.put("ROLE_ORDER_ADMIN",new RootAdminRole("ROLE_ORDER_ADMIN"));
        roleOperationMap.put("ROLE_NORMAL",new RootAdminRole("ROLE_NORMAL"));

    }

    public static RoleOperation getOp(String roleName){
        return  roleOperationMap.get(roleName);
    }
}
