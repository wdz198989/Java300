package ifElse���������.ö������;


/**
 * @Author : WuDazhong
 * @Date :2020/4/2 19:50
 * @Description : ��ɫ�ж���
 */
public class JudgeRole {

    public String judge( String roleName ) {
        // һ�д���㶨��֮ǰ��if/elseû�ˣ�
        return RoleEnum.valueOf(roleName).op();
    }
}
