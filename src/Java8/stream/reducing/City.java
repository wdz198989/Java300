package Java8.stream.reducing;


/**
 * @Author : WuDazhong
 * @Date :2021/1/5 19:42
 * @Description :
 */
public class City {
    /**
     * 城市名
     */
    private String name;

    /**
     * 构造器
     * @param name 城市名
     */
    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
