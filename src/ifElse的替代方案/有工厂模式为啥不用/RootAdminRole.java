package ifElse���������.�й���ģʽΪɶ����;


/**
 * @Author : WuDazhong
 * @Date :2020/4/2 19:53
 * @Description : ϵͳ����Ա���в���A��Ȩ�ޣ�
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
