package ifElse���������.������ʱ;


/**
 * @Author : WuDazhong
 * @Date :2020/4/2 19:43
 * @Description : ��ɫ�ж���
 */
public class JudgeRole {

    public String judge( String roleName ) {
        String result = "";
        if (roleName.equals("ROLE_ROOT_ADMIN")) {
            // ϵͳ����Ա��AȨ��
            result = "ROLE_ROOT_ADMIN: " + "has AAA permission";
        } else if ( roleName.equals("ROLE_ORDER_ADMIN") ) {
            // ��������Ա��BȨ��
            result = "ROLE_ORDER_ADMIN: " + "has BBB permission";
        } else if ( roleName.equals("ROLE_NORMAL") ) {
            // ��ͨ�û���CȨ��
            result = "ROLE_NORMAL: " + "has CCC permission";
        } else {
            result = "XXX";
        }
        return result;
    }
}
