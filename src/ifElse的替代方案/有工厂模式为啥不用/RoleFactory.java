package ifElse���������.�й���ģʽΪɶ����;


import java.util.HashMap;
import java.util.Map;

/**
 * @Author : WuDazhong
 * @Date :2020/4/2 19:59
 * @Description : ������
 */
public class RoleFactory {

    static Map<String,RoleOperation> roleOperationMap=new HashMap<>();
    //�ھ�̬�����Ȱѳ�ʼ���������
    static {
        roleOperationMap.put("ROLE_ROOT_ADMIN",new RootAdminRole("ROLE_ROOT_ADMIN"));
        roleOperationMap.put("ROLE_ORDER_ADMIN",new RootAdminRole("ROLE_ORDER_ADMIN"));
        roleOperationMap.put("ROLE_NORMAL",new RootAdminRole("ROLE_NORMAL"));

    }

    public static RoleOperation getOp(String roleName){
        return  roleOperationMap.get(roleName);
    }
}
