package summary.GC;


import java.lang.ref.SoftReference;

/**
 * @Author : WuDazhong
 * @Date :2019/7/23 2:54
 * @Description : 测试软引用
 */
public class SoftReferenceDemo {

    public static void main(String[] args) {
        //softRef_Memory_Enough();
        softRef_Memory_NotEnough();

    }

    /**
     * 内存足够
     */
    public static void softRef_Memory_Enough(){
        Object o1 = new Object();
        SoftReference<Object> softReference = new SoftReference<>(o1);
        System.out.println(o1);
        System.out.println(softReference.get());
        o1=null;
        System.gc();
        System.out.println(o1);
        System.out.println(softReference.get());

    }

    /**
     * 内存不够
     */
    public static void softRef_Memory_NotEnough(){
        Object o1 = new Object();
        SoftReference<Object> softReference = new SoftReference<>(o1);
        System.out.println(o1);
        System.out.println(softReference.get());
        o1=null;

        try{
            byte[] bytes = new byte[30 * 1024 * 1024];
        }catch(Throwable e){
            e.printStackTrace();
        }finally {
            System.out.println(o1);
            System.out.println(softReference.get());
        }


    }
}
