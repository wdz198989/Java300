package Java8.lamda;


import java.util.Arrays;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2019/10/26 22:25
 * @Description : ����lambda���ʽ���б���е���
 * ������lambda���ʽ����Ҫ����:
 *
 *     ��ѡ��������������Ҫ�����������ͣ�����������ͳһʶ�����ֵ��
 *     ��ѡ�Ĳ���Բ���ţ�һ���������趨��Բ���ţ������������Ҫ����Բ���š�
 *     ��ѡ�Ĵ����ţ�������������һ����䣬�Ͳ���Ҫʹ�ô����š�
 *     ��ѡ�ķ��عؼ��֣��������ֻ��һ�����ʽ����ֵ����������Զ�����ֵ����������Ҫָ�������ʽ������һ����ֵ��
 */
public class ForEach {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "c", "C++", "php", "c#");
        list.forEach(n -> System.out.println(n));
        list.forEach(System.out::println);
    }
}
