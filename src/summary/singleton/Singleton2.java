package summary.singleton;


/**
 * @Author : WuDazhong
 * @Date :2019/7/12 0:57
 * @Description : ����ʽ���������Ǵ�����ʽ�������Կ���������ʵ�����ӳټ��أ�
 *                ��ֻ��������ʹ�õ�ʱ��Ż�ʵ����һ�����󲢽����Լ�������
 */
public class Singleton2 {

    // ָ���Լ�ʵ����˽�о�̬����
    private static Singleton2 singleton2;

    // ˽�еĹ��췽��
    private Singleton2(){}
    //TODO  ԭʼ
    // ���Լ�ʵ��Ϊ����ֵ�ľ�̬�Ĺ��з�������̬��������
   /* public static Singleton2 getSingleton2(){
        // ������������������Ҫʹ��ʱ��ȥ����
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }*/
    //TODO  ͬ���ӳټ��� �� synchronized����

    /**
     * ������ʵ�������洫ͳ����ʽ������ʵ��Ψһ�Ĳ������ڣ�
     * �Ƿ�ʹ�� synchronized ���� getSingleton2()��������ʹ�ã��ͱ�֤�˶��ٽ���Դ��ͬ��������ʣ�
     * Ҳ�ͱ�֤�˵�����
     *
     * ������ִ�н���������������Ѿ�����ˣ���������ʵ�ַ�ʽ������Ч�ʻ�ܵͣ�
     * ��Ϊͬ������������е�󣬶������������е�֡�ͬ������Ч�ʵͣ������ǿ���ʹ��ͬ���������ʵ�֡�
     * @return
     */
    // ʹ�� synchronized ���Σ��ٽ���Դ��ͬ���������
    /*public static synchronized Singleton2 getSingleton2(){
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }*/


    //TODO  ͬ���ӳټ��� �� synchronized��
    public static Singleton2 getSingleton2(){
        // ʹ�� synchronized �飬�ٽ���Դ��ͬ���������
        synchronized(Singleton2.class){
            if (singleton2 == null) {
                singleton2 = new Singleton2();
            }
        }
        return singleton2;
    }






    /**
     * ������֮�����ٶȺͷ�Ӧʱ��Ƕ�����������ʽ���ֳ��������أ�Ҫ��һЩ��
     *    ����Դ����Ч����˵������ʽ���ֳ��ӳټ��أ�Ҫ��һЩ��
     */

     /*    3������ģʽ���ŵ�

�������Ǵӵ���ģʽ�Ķ����ʵ�֣�����֪������ģʽ�������¼����ŵ㣺

    ���ڴ���ֻ��һ�����󣬽�ʡ�ڴ�ռ䣻

    ����Ƶ���Ĵ������ٶ��󣬿���������ܣ�

    ����Թ�����Դ�Ķ���ռ�ã��򻯷��ʣ�

    Ϊ����ϵͳ�ṩһ��ȫ�ַ��ʵ㡣*/

}
