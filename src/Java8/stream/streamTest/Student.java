package Java8.stream.streamTest;


/**
 * @Author : WuDazhong
 * @Date :2020/4/3 9:36
 * @Description : ѧ���ࣨ�Ժ��ǲ�������ࣩ
 */
public class Student  {
    private Integer id;
    private String name;
    private Integer age;
    private Double score;

    public Student() {
    }

    public Student(Integer id, String name, Integer age, Double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }


}
