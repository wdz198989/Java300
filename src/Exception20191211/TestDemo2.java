package Exception20191211;


/**
 * @Author : WuDazhong
 * @Date :2019/12/11 21:40
 * @Description : ����֮��Ĳ���
 */
public class TestDemo2 {

    /**
     * b���ָ��ͻ�c�ķ���1111���������ǵĴ�ӡ�ǳ��ָ�c��
     * @param args
     * @throws Exception
     */
    public static void main(String[] args){
        String num = "1234tr";
        ResponseDemo<Integer> reponse = numberFormat(num);
        if(reponse.getCode() == 101) {
            System.out.println(reponse.getMessage());
        }else {
            System.out.println(reponse.getData());
        }
    }

    public static ResponseDemo<Integer>  numberFormat(String num) {
        ResponseDemo<Integer> response = new ResponseDemo<>();
        try {
            int x = Integer.parseInt(num);
            response.setCode(100);
            response.setMessage("����ת���ɹ����ѽ�ֵ����data�¡�");
            response.setData(x);
        } catch (Exception e) {
            response.setCode(101);
            response.setMessage("������ַ������г������������������͵ĸ�ʽ�����ݴ���");
        }
        return response;

    }

}
