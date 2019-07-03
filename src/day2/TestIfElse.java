package day2;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 15:25
 * @Description : 测试ifElse双选择结构
 */
public class TestIfElse {

    public static void main(String[] args) {
        double r = 4 * Math.random();
        double area = Math.PI * Math.pow(r, 2);
        double circle = 2 * Math.PI * r;



        if (area >= circle) {

            System.out.println("面积大于周长");



        } else {
            System.out.println("周长大于面积");
        }
    }


}
