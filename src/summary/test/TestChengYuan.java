package summary.test;


/**
 * @Author : WuDazhong
 * @Date :2019/7/15 11:24
 * @Description : ���Գ�Ա�����;ֲ�����������
 */
public class TestChengYuan {


    /*1. ���﷨��ʽ�Ͽ�:��Ա������������ģ����ֲ��������ڷ����ж���ı������Ƿ����Ĳ�����
          ��Ա�������Ա� public,private,static �����η������Σ����ֲ��������ܱ����ʿ������η��� static �����Σ�
         ���ǣ���Ա�����;ֲ��������ܱ� final �����Ρ�
      2.  �ӱ������ڴ��еĴ洢��ʽ����:�����Ա������ʹ��static���εģ���ô�����Ա������������ģ�
         ���û��ʹ��static���Σ������Ա����������ʵ���ġ�����������ڶ��ڴ棬�ֲ������������ջ�ڴ档
      3.  �ӱ������ڴ��е�����ʱ���Ͽ�:��Ա�����Ƕ����һ���֣������Ŷ���Ĵ��������ڣ�
          ���ֲ��������ŷ����ĵ��ö��Զ���ʧ��
      4. ��Ա�������û�б�����ֵ:����Զ������͵�Ĭ��ֵ����ֵ��һ���������:�� final ���εĳ�Ա����
          Ҳ������ʽ�ظ�ֵ�������ֲ������򲻻��Զ���ֵ��
*/

    public static String name;
    private String uName;
    private int age;
    private boolean isMan;
    public static final int scoreEnglish=10;
    public  final int scoreMath=100;

    public static void main(String[] args) {
        //static String name;
        final String uName;
        //System.out.println(uName);
        System.out.println(name);
        TestChengYuan tt = new TestChengYuan();
        System.out.println(tt.age);
        System.out.println(tt.uName);
        System.out.println(tt.isMan);
    }
}
