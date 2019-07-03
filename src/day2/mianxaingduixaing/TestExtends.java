package day2.mianxaingduixaing;


/**
 * @Author : WuDazhong
 * @Date :2019/7/2 23:45
 * @Description : 测试继承
 */
public class TestExtends {
    public static void main(String[] args) {
        Student   stu  =  new Student();
        stu.name="高淇";
        stu.height = 172;
        stu.rest();

        Student  stu2 = new Student("希希",6,"挖掘机专业");

        System.out.println(stu2   instanceof  Student);
        System.out.println(stu2   instanceof   Person );
        System.out.println(stu2   instanceof   Object );
        System.out.println(new Person()   instanceof   Student );

    }
}


class  Person   /*extends  Object*/ {
    String  name;
    int   height;

    public void  rest(){
        System.out.println("休息一会！");
    }
}

class  Student   extends  Person  {
    String   major;

    public   void   study(){
        System.out.println("学习两小时！");
    }

    public  Student(String name,int height, String  major){
        this.name = name;
        this.height = height;
        this.major = major;
    }

    public Student(){
    }


}
