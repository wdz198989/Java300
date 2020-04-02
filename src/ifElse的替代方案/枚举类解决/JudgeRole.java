package ifElse的替代方案.枚举类解决;


/**
 * @Author : WuDazhong
 * @Date :2020/4/2 19:50
 * @Description : 角色判断类
 */
public class JudgeRole {

    public String judge( String roleName ) {
        // 一行代码搞定！之前的if/else没了！
        return RoleEnum.valueOf(roleName).op();
    }
}
