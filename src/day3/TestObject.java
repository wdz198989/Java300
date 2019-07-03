package day3;


/**
 * @Author : WuDazhong
 * @Date :2019/7/3 16:17
 * @Description : ²âÊÔobject
 */
public class TestObject {
    public static void main(String[] args) {

        TestObject   to = new TestObject();
        System.out.println(to.toString());

        Person2  p2 = new Person2("ÎûÎû", 6);
        System.out.println(p2.toString());
        Object obj;
        String str;

    }

    public String toString(){
        return  "²âÊÔObject¶ÔÏó";
    }

}


class Person2 {
    String name;
    int age;

    @Override
    public String toString() {
        return name+",ÄêÁä"+age;
    }

    public Person2(String  name, int age) {
        this.name = name;
        this.age = age;
    }


}
