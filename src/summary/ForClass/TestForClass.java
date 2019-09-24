package summary.ForClass;


/**
 * @Author : WuDazhong
 * @Date :2019/8/12 20:25
 * @Description : 对象类型判断的四种方式
 */
public class TestForClass {
    public static void main(String[] args) {
        AClass a = new AClass();
        BClass b = new BClass();
        CClass c = new CClass();

        System.out.println(a instanceof AClass);
        System.out.println(b instanceof AClass);
        System.out.println(b instanceof CClass);

        System.out.println(a.getClass().equals(AClass.class));

        System.out.println(AClass.class.isInstance(a));

        System.out.println(AClass.class.isAssignableFrom(BClass.class));
        System.out.println(BClass.class.isAssignableFrom(AClass.class));


    }


}
