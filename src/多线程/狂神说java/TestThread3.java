package ���߳�.����˵java;


import java.util.concurrent.*;

/**
 * @Author : WuDazhong
 * @Date :2020/8/9 18:39
 * @Description : �������̵߳ķ�ʽ��
 */
public class TestThread3 implements Callable<Boolean> {

    @Override
    public Boolean call() throws Exception {
        for (int i = 0; i < 20; i++) {
            System.out.println("���ڿ����롣��������������������������������"+i);

        }
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // new Callable��ʵ����
        TestThread3 testThread3 = new TestThread3();
        // ����ִ������
        ExecutorService service = Executors.newFixedThreadPool(1);
        //�ύִ��
        Future<Boolean> submit = service.submit(testThread3);
        // ��ȡ���
        Boolean aBoolean = submit.get();
        //�رշ���
        service.shutdown();


    }
}
