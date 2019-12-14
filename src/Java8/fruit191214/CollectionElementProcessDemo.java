package Java8.fruit191214;


import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @Author : WuDazhong
 * @Date :2019/12/14 22:59
 * @Description : ����Ĵ��루�嵥4���еĴ�����ʾ��java.util.functional.Consumer�ӿڵ���һ���÷���
 * ��lambda���ʽ�� ����ı��ʽ������ÿ��Ԫ���Լ���ض��Ĺ���/�������ͣ�
 * Ȼ��ʹ���ʵ��Ĺ���/�����ض��ʺ��
 * ��ʵ����ʾConsumer API�����ڸ��Ӳ��������������ǽ�Ԫ�ش�ӡ���������̨��
 */
public class CollectionElementProcessDemo {

    public  void evaluate(){
        Consumer<String> listEntries=(l) ->{

            System.out.println("processing:"+l);
            switch (l){
                case "USA":
                    System.out.println("Hello"+l);
                    break;
                case "Spain":
                    System.out.println("hola"+l);
                    break;
                case "France":
                    System.out.println("Bonjour"+l);
                    break;
                case "India":
                    System.out.println("Namaste"+l);
                    break;
                case "China":
                    System.out.println("���"+l);
                    break;
            }

        };


        ArrayList<String> countryList = new ArrayList<>();
        countryList.add("India");
        countryList.add("USA");
        countryList.add("Thailand");
        countryList.add("France");
        countryList.add("Spain");
        countryList.add("China");
        countryList.add("abc");
        System.out.println("\n");
        countryList.stream().forEach(listEntries);


    }


    public static void main(String... args) {
        CollectionElementProcessDemo demo = new CollectionElementProcessDemo();
        demo.evaluate();
    }


}
