package summary.mapStruct;


import org.junit.Before;
import org.junit.Test;

/**
 * @Author : WuDazhong
 * @Date :2019/7/18 20:57
 * @Description : 测试类，模拟将user对象转换成UserRoleDto对象
 */
public class MainTest {
    User user = null;
    Role role= null;

    /**
     * 模拟从数据库中查出user对象
     */
    @Before
    public void before() {
        role  = new Role(2L, "administrator", "超级管理员");
        System.out.println(role);
        user  = new User(1L, "zhangsan", "12345",
                "17677778888", "123@qq.com", role);
        System.out.println(user);
    }

    /**
     * 模拟把user对象转换成UserRoleDto对象
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


