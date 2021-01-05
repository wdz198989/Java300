package Java8.stream.reducing;


/**
 * @Author : WuDazhong
 * @Date :2021/1/5 19:43
 * @Description :
 */
public class Person {

    /**
     * ���ڳ���
     */
    private City city;

    /**
     * ���
     */
    private int height;

    /**
     * ������
     * @param city ���ڳ���
     * @param height ���
     */
    public Person(City city, int height) {
        this.city = city;
        this.height = height;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
