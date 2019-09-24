package JinRjava.内部类;

/**
 * @Author : WuDazhong
 * @Date :2019/7/13 10:18
 * @Description : 需求实现
 *
 * 定义HandleAble接口，具备一个处理字符串数字的抽象方法方法HandleString（String num）。
 *
 *     处理方式1：取整数部分。
 *     处理方式2：保留指定位小数，四舍五入。
 *     匿名内部类的方式，调用所有抽象方法。
 */
public class Test01 {
    public static void main(String[] args) {

        String str = "23.23456789";
        System.out.println("原数字字符串:" + str);

        HandleAble s1 = new HandleAble() {
            @Override
            public String handleString(String str) {
                return str.substring(0, str.indexOf("."));
            }
        };
        String string = s1.handleString(str);

        System.out.println("取整后:" + string);

        int num = 4;

        HandleAble s2 = new HandleAble() {
            @Override
            public String handleString(String str) {

                int i = str.indexOf(".") + num + 1;
                char c = str.charAt(i);

                if (c <= '4') {
                    return str.substring(0, i).toString();
                } else {
                    char c1 = (char) (str.charAt(str.indexOf(".") + num) + 1);
                    return str.substring(0, i - 1) + c1;

                }
            }
        };
        String sss = s2.handleString(str);
        System.out.println("保留" + num + "位小数后:" + sss);

    }
}
interface HandleAble {
    public abstract String handleString(String str);
}

