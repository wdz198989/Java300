package �㷨.ð������;


/**
 * @Author : WuDazhong
 * @Date :2020/9/23 14:55
 * @Description :
 */
/**
 * �㷨�ĵڶ����Ż�#
 *
 * ��������������������⣬��ð�������л���һ��������ڣ����ǵ� i ���ŵĵ� i С���ߴ��Ԫ���Ѿ��ڵ� i λ���ˣ��������ܵ� i-1 λҲ�Ѿ���λ�ˣ���ô���ڲ�ѭ����ʱ��������������־ͻᵼ�¶���ıȽϳ��֡����磺6��4��7��5��1��3��2�������ǽ��е�һ�������ʱ�򣬽��Ϊ6��7��5��4��3��2��1��ʵ���Ϻ����кܶ�ν����Ƚ϶��Ƕ���ģ���Ϊû�в�������������
 *
 * ���������øո��Ż���һ�ε��㷨����һ��������顣
 */
public class BubbleSoerOpt2 {
    public static void main(String[] args) {
        int[] list = {6,4,7,5,1,3,2};
        int len = list.length-1;
        int temp = 0; // ����һ����ʱ�ռ�, ��Ž������м�ֵ
        // Ҫ�����Ĵ���
        for (int i = 0; i < list.length-1; i++) {
            int flag = 1; //����һ����־λ
            //���εıȽ������������Ĵ�С������һ�κ󣬰������е�iС�������ڵ�i��λ����
            for (int j = 0; j < len-i; j++) {
                // �Ƚ����ڵ�Ԫ�أ����ǰ�����С�ں������������
                if (list[j] < list[j+1]) {
                    temp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = temp;
                    flag = 0;  //������������־λ��0

                }
                System.out.format("�� %d ���%d �˽����", i+1, j+1);
                for(int count:list) {
                    System.out.print(count);
                }
                System.out.println("");
            }

            System.out.format("�� %d �����ս����", i+1);
            for(int count:list) {
                System.out.print(count);
            }
            System.out.println("");
            if (flag == 1) {//���û�н�����Ԫ�أ����Ѿ�����
                return;
            }

        }
    }
}
