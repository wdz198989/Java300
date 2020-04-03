package Java8.stream;


import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Author : WuDazhong
 * @Date :2020/4/3 9:28
 * @Description : Stream��˳�����벢����
 */
public class StreamAPI2 {
    /**
     * �������ԣ�֧�ֲ�������˳����
     * ������������߳�ͬʱ����
     * ˳������ʹ�����̣߳����߳�
     */
    public static void main(String[] args) {
        Optional<Integer> optionalInteger = Stream.iterate(1, x -> x+1).limit(20).peek(x->{
                    System.out.println(Thread.currentThread().getName());
                }
        ).max(Integer::compareTo);
        System.out.println(optionalInteger);
        //��� main main Optional[20]��ʼ��ʹ�õ������̣߳�˵����Ĭ����˳������ʹ�õ������߳�

        System.out.println("===================================================================");
        Optional<Integer> optional = Stream.iterate(1, x -> x+1).limit(20).peek(x->{
                    System.out.println(Thread.currentThread().getName());
                }
        ).parallel().max(Integer::compareTo);

        System.out.println(optional);
        //���� .parallel()���Խ����޸ĳɲ��������ڲ��Զ��̲߳���ִ������ķ�ʽִ��
        //�����˵���ж���߳��ڲ���ִ��
        //ForkJoinPool.commonPool-worker-2
        //ForkJoinPool.commonPool-worker-3
        //Optional[20]

        System.out.println("===================================================================");
        //�����������˳���� ����.sequential()
        //����lambda���ʽ���е��߳�������ʹ��parallelism
        //������������:��������������� java.util.concurrent.ForkJoinPool.common.parallelism
        //����Ϊ5���߳�����
        Optional<Integer> optional1 = Stream.iterate(1, x -> x+1).limit(20).peek(x->{
                    System.out.println(Thread.currentThread().getName());
                }
        ).parallel().sequential().max(Integer::compareTo);
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism","5");
    }
}
