package ifElse���������.�й���ģʽΪɶ����;


/**
 * @Author : WuDazhong
 * @Date :2020/4/2 20:04
 * @Description : ��ɫ�ж�
 */
public class judgeRole {
    public String judge( String roleName ) {
        // һ�д���㶨��֮ǰ�� if/elseҲû�ˣ�
        return RoleFactory.getOp(roleName).op();
    }
}
