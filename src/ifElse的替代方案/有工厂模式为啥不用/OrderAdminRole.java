package ifElse���������.�й���ģʽΪɶ����;


/**
 * @Author : WuDazhong
 * @Date :2020/4/2 19:56
 * @Description : ��������Ա������B��Ȩ�ޣ�
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
