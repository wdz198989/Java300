package �㷨.ð������;


/**
 * @Author : WuDazhong
 * @Date :2020/9/23 14:57
 * @Description :
 */
/*��������������⣬���ǿ����뵽������һ����־λ����¼һ�µ�ǰ�� i �������������һ��λ�õ��±꣬�ڽ��е� i+1 �˵�ʱ��ֻ��Ҫ��ѭ��������±��λ�þͿ����ˣ���Ϊ����λ���ϵ�Ԫ������һ����û�л�λ����һ��Ҳ�����ܻỻλ���ˡ��������ԭ�����ǿ��Խ�һ���Ż����ǵĴ��롣
 */
public class BubbleSoerOpt3 {

        public static void main(String[] args) {
            int[] list = {6,4,7,5,1,3,2};
            int len = list.length-1;
            int temp = 0; // ����һ����ʱ�ռ�, ��Ž������м�ֵ
            int tempPostion = 0;  // ��¼���һ�ν�����λ��
            // Ҫ�����Ĵ���
            for (int i = 0; i < list.length-1; i++) {
                int flag = 1; //����һ����־λ
                //���εıȽ������������Ĵ�С������һ�κ󣬰������е�iС�������ڵ�i��λ����
                for (int j = 0; j < len; j++) {
                    // �Ƚ����ڵ�Ԫ�أ����ǰ�����С�ں������������
                    if (list[j] < list[j+1]) {
                        temp = list[j+1];
                        list[j+1] = list[j];
                        list[j] = temp;
                        flag = 0;  //������������־λ��0
                        tempPostion = j;  //��¼������λ��
                    }
                    System.out.format("�� %d ���%d �˽����", i+1, j+1);
                    for(int count:list) {
                        System.out.print(count);
                    }
                    System.out.println("");
                }
                len = tempPostion; //�����һ�ν�����λ�ø�len����������ѭ���Ĵ���
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
