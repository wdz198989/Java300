package ���췽������;



/**
 * @Author : WuDazhong
 * @Date :2020/5/30 23:07
 * @Description : �����½�����ִ�ж����Ĭ�Ϸ���
 */
public class People {
    private String name;
    private int usedMoney;
    private int salary;
    private int needMoney;
    // �ҵ�̬��
    public String myAtu(){
        return "�����˵����";
    }
    //�жϸ����Ƿ�߱�����iphone�ʸ�
    public String canByIPhone(){
        if((salary-usedMoney)>=needMoney){
           return "������";
        }else{
            return "��������";
        }
    }

    public static void main(String[] args) {
        People people = new People("³��", 2000, 6000, 5000);
        System.out.println(people.getName()+people.canByIPhone()+ "ƻ���ֻ���"+people.myAtu());
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
