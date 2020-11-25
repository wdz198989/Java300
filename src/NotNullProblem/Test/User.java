package NotNullProblem.Test;


/**
 * @Author : WuDazhong
 * @Date :2020/11/25 11:34
 * @Description : ”√ªß¿‡
 */
public class User {
    private Integer id;
    private String name;
    private Integer follows;
    private Integer fans;

    public User(Integer id, String name, Integer follows, Integer fans) {
        this.id = id;
        this.name = name;
        this.follows = follows;
        this.fans = fans;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFollows() {
        return follows;
    }

    public void setFollows(Integer follows) {
        this.follows = follows;
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", follows=" + follows +
                ", fans=" + fans +
                '}';
    }
}
