package summary.mapStruct;


import org.junit.Before;
import org.junit.Test;

/**
 * @Author : WuDazhong
 * @Date :2019/7/18 20:57
 * @Description : �����࣬ģ�⽫user����ת����UserRoleDto����
 */
public class MainTest {
    User user = null;
    Role role= null;

    /**
     * ģ������ݿ��в��user����
     */
    @Before
    public void before() {
        role  = new Role(2L, "administrator", "��������Ա");
        System.out.println(role);
        user  = new User(1L, "zhangsan", "12345",
                "17677778888", "123@qq.com", role);
        System.out.println(user);
    }

    /**
     * ģ���user����ת����UserRoleDto����
     */
    @Test
    public void test1() {
        UserRoleDto userRoleDto = new UserRoleDto();
        userRoleDto.setUserId(user.getId());
        userRoleDto.setName(user.getUsername());
        userRoleDto.setRoleName(user.getRole().getRoleName());
        System.out.println(userRoleDto);
    }
}


