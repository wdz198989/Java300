package day3;


/**
 * @Author : WuDazhong
 * @Date :2019/7/3 19:41
 * @Description : ���Զ�̬
 */
public class TestPolym2 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animalCry(animal);
        Animal d = new Dog();
        animalCry(d);
        Dog dog = new Dog();
        dog.seeDoor();
        animalCry(dog);

        Animal a = new Cat();
        //TODO �˴�����ͨ�����������в�ͨ��  Exception in thread "main" java.lang.ClassCastException: day3.TestPolym2$Cat cannot be cast to day3.TestPolym2$Dog
        Dog d2 = (Dog)a;





    }

    static  void  animalCry(Animal a){
        a.shout();
    }

    static class Animal{
        public  void shout(){
            System.out.println("����һ��");
        }

    }

    static class  Dog extends Animal{
       @Override
        public  void shout(){
            System.out.println("��������������������������");


        }

        public void seeDoor(){
            System.out.println("����");
        }
    }

    static class  Cat extends Animal{
        @Override
        public  void shout(){
            System.out.println("��������������������������");
        }
    }
}
