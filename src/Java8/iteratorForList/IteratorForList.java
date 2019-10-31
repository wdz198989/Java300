package Java8.iteratorForList;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author : WuDazhong
 * @Date :2019/10/31 22:50
 * @Description : �������ϵļ��ַ�ʽ���ܽ�
 */
public class IteratorForList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "c", "C++", "php", "c#");

        /**
         * ����һ������ͨ�Ĳ���˼����д��
         * �ŵ㣺�ϳ������������
         * ȱ�㣺ÿ�ζ�Ҫ����list.size()
         * */

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /**
         * �����������鳤����ȡ����
         * �ŵ㣺����ÿ�ζ�����
         * ȱ�㣺1��m�������򲻹�С��Υ������С������ԭ�� 2��������forѭ���в���list�Ĵ�С��
         * �����ȥ���¼�һ��Ԫ��
         */

        int m = list.size();
        for (int i = 0; i < m; i++) {
            System.out.println(list.get(i));
        }

        /**
         * �����������鳤����ȡ����
         * �ŵ㣺1������ÿ�ζ����� 2�����б�������������ѭ����С��Χԭ��
         * ȱ�㣺1��m�������򲻹�С��Υ������С������ԭ�� 2��������forѭ���в���list�Ĵ�С��
         * �����ȥ���¼�һ��Ԫ��
         */

        for (int i = 0, n = list.size(); i < n; i++) {
            System.out.println(list.get(i));
        }

        /**
         * �����ģ����õ����д��
         * �ŵ㣺1������ÿ�ζ����� 2�����б�������������ѭ����С��Χԭ��
         * ȱ�㣺1�������˳��ᷴ 2����������ϰ�ߣ����׶���
         * ���ó��ϣ�����ʾ���˳���޹صĵط������籣��֮ǰ���ݵ�У��
         */

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        /**
         * �����壺Iterator����
         * �ŵ㣺���
         * ȱ�㣺
         */

        for (Iterator<String> it = list.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }


        /**
         *��������jdk1.5��д��
         * �ŵ㣺����Ϸ���ʹ�ø����
         * ȱ�㣺jdk1.4���²�����
         */

        for (Object o : list) {
            System.out.println(o);
        }



    }
}
