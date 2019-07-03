package day3;


import java.util.ArrayList;

/**
 * @Author : WuDazhong
 * @Date :2019/7/3 10:51
 * @Description : 测试快捷键
 */
public class TemplatesTest{

    public static void main(String[] args) {
        int num =1;

   
         
        System.out.println("num = " + num);
        System.out.println("args = [" + args + "]");
        System.out.println("num = " + num);
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        System.out.println("########################");
        String[] arr = {"Jerry", "jacvk", "HanMeimei", "Lilei"};
        // fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }
        //TODO 模板四 list.for
        ArrayList list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形 list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
      //TODO list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        //TODO 模板五 ifn
        if (list == null) {
            
        }
        //变形 inn
        if (list != null) {
            
        }

    }


}
