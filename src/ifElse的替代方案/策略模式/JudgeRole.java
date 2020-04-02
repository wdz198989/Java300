package ifElse的替代方案.策略模式;


/**
 * @Author : WuDazhong
 * @Date :2020/4/2 20:15
 * @Description :
 */
public class JudgeRole {
    public String judge( RoleOperation roleOperation ) {
        RoleContext roleContext = new RoleContext(roleOperation);
        return  roleContext.execute();
    }

    public static void main(String[] args) {
        JudgeRole judgeRole = new JudgeRole();
        String result1 = judgeRole.judge(new RootAdminRole("ROLE_ROOT_ADMIN"));
        System.out.println(result1);
        String result2 = judgeRole.judge(new RootAdminRole("ROLE_ORDER_ADMIN"));
        System.out.println(result2);
        String result3 = judgeRole.judge(new RootAdminRole("ROLE_NORMAL"));
        System.out.println(result3);
    }
}
