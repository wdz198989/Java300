package Java8.stream;


import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Author : WuDazhong
 * @Date :2020/4/3 9:28
 * @Description : Stream的顺序流与并行流
 */
public class StreamAPI2 {
    /**
     * 流的特性：支持并行流与顺序流
     * 并行流：多个线程同时运行
     * 顺序流：使用主线程，单线程
     */
    public static void main(String[] args) {
        Optional<Integer> optionalInteger = Stream.iterate(1, x -> x+1).limit(20).peek(x->{
                    System.out.println(Thread.currentThread().getName());
                }
        ).max(Integer::compareTo);
        System.out.println(optionalInteger);
        //输出 main main Optional[20]，始终使用的是主线程，说明流默认是顺序流，使用的是主线程

        System.out.println("===================================================================");
        Optional<Integer> optional = Stream.iterate(1, x -> x+1).limit(20).peek(x->{
                    System.out.println(Thread.currentThread().getName());
                }
        ).parallel().max(Integer::compareTo);

        System.out.println(optional);
        //加上 .parallel()可以将其修改成并行流，内部以多线程并行执行任务的方式执行
        //输出：说明有多个线程在并行执行
        //ForkJoinPool.commonPool-worker-2
        //ForkJoinPool.commonPool-worker-3
        //Optional[20]

        System.out.println("===================================================================");
        //将并行流变成顺序流 加上.sequential()
        //设置lambda表达式并行的线程数量，使用parallelism
        //设置启动变量:加上这个参数设置 java.util.concurrent.ForkJoinPool.common.parallelism
        //设置为5个线程数量
        Optional<Integer> optional1 = Stream.iterate(1, x -> x+1).limit(20).peek(x->{
                    System.out.println(Thread.currentThread().getName());
                }
        ).parallel().sequential().max(Integer::compareTo);
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism","5");
    }
}
