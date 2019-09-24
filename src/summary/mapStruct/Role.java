package summary.mapStruct;



import java.util.Objects;

/**
 * @Author : WuDazhong
 * @Date :2019/7/18 20:54
 * @Description : ½ÇÉ«±í
 */
public class Role  {

    private Long id;
    private String roleName;
    private String description;

    public Role() {
    }

    public Role(Long id, String roleName, String description) {
        this();


        this.id = id;
        this.roleName = roleName;
        this.description = description;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id) &&
                Objects.equals(roleName, role.roleName) &&
                Objects.equals(description, role.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, roleName, description);
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
