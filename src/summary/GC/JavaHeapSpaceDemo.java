package summary.GC;


import java.util.Random;

/**
 * @Author : WuDazhong
 * @Date :2019/7/23 11:53
 * @Description : ¶ÑÄÚ´æÒç³ö
 */
public class JavaHeapSpaceDemo {

    public static void main(String[] args) {
        String str ="Wudazhong";
        while (true){
            str+=str+ new Random().nextInt(1111111)+new Random().nextInt(1111111);
            str.intern();
        }
    }
}
