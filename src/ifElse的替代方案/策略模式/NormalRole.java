package ifElse���������.����ģʽ;



/**
 * @Author : WuDazhong
 * @Date :2020/4/2 19:57
 * @Description : ��ͨ�û�������C��Ȩ�ޣ�
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
