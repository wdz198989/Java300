package summary.variable;


import java.util.Objects;

/**
 * @Author : WuDazhong
 * @Date :2019/7/15 22:05
 * @Description : 测试
 */
public class Test {

    private static void main(String[] args) {
        // TODO Auto-generated method stub
        Student s1 = new Student("小张");
        Student s2 = new Student("小李");
        Test.swap(s1, s2);
        System.out.println("s1:" + s1.getName());
        System.out.println("s2:" + s2.getName());
    }

    public static void swap(Student x, Student y) {
        Student temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x.getName());
        System.out.println("y:" + y.getName());
    }
}

  class Student{
    public String name;

      public Student() {
      }

      public Student(String name) {
          this.name = name;
      }

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      @Override
      public String toString() {
          return "Student{" +
                  "mane='" + name + '\'' +
                  '}';
      }

      @Override
      public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Student student = (Student) o;
          return Objects.equals(name, student.name);
      }

      @Override
      public int hashCode() {

          return Objects.hash(name);
      }
  }
