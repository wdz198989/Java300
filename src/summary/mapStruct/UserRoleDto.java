package summary.mapStruct;


/**
 * @Author : WuDazhong
 * @Date :2019/7/18 20:55
 * @Description : 两张表的共有属性
 */
public class UserRoleDto {

    private Long userId;
    /**
     * 用户名
     */
    private String name;
    /**
     * 角色名
     */
    private String roleName;

    public UserRoleDto() {
    }

    public UserRoleDto(Long userId, String name, String roleName) {
        this.userId = userId;
        this.name = name;
        this.roleName = roleName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "UserRoleDto{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
