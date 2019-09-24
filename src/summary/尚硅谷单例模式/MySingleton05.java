package summary.尚硅谷单例模式;


/**
 * @Author : WuDazhong
 * @Date :2019/7/15 14:25
 * @Description : 懒汉式
 */
public class MySingleton05 {
    private static MySingleton05 Instance;

    private MySingleton05(){

    }

    public static MySingleton05 getInstance() {
        if(Instance == null){
            synchronized (MySingleton05.class) {
                if (Instance == null) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Instance = new MySingleton05();
                }




            }
        }
        return Instance;

        }

}
