package 构造方法测试;


/**
 * @Author : WuDazhong
 * @Date :2020/10/17 9:44
 * @Description :
 */
public class TestDog {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        animal.move();
        dog.move();
        //dog.bark();
    }
}
