package 构造方法测试;



/**
 * @Author : WuDazhong
 * @Date :2020/5/30 23:07
 * @Description : 测试新建对象执行对象的默认方法
 */
public class People {
    private String name;
    private int usedMoney;
    private int salary;
    private int needMoney;
    // 我的态度
    public String myAtu(){
        return "吴大忠说哈哈";
    }
    //判断该人是否具备购买iphone资格
    public String canByIPhone(){
        if((salary-usedMoney)>=needMoney){
           return "可以买";
        }else{
            return "不可以买";
        }
    }

    public static void main(String[] args) {
        People people = new People("鲁慧", 2000, 6000, 5000);
        System.out.println(people.getName()+people.canByIPhone()+ "苹果手机，"+people.myAtu());
    }


    public People(String name, int usedMoney, int salary, int needMoney) {
        this.name = name;
        this.usedMoney = usedMoney;
        this.salary = salary;
        this.needMoney = needMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUsedMoney() {
        return usedMoney;
    }

    public void setUsedMoney(int usedMoney) {
        this.usedMoney = usedMoney;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getNeedMoney() {
        return needMoney;
    }

    public void setNeedMoney(int needMoney) {
        this.needMoney = needMoney;
    }
}
