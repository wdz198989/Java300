package Exception20191211;


/**
 * @Author : WuDazhong
 * @Date :2019/12/11 21:38
 * @Description : ���巵�ؽ������
 */
public class ResponseDemo<T> {

    private Integer code;	//������룬100Ϊ��ȷ��101Ϊ����
    private String message;	//������Ϣ
    private T data;			//ת�������ֵ��Ŵ�
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "ResponseDemo [�������Ϊ=" + code + ", ������ϢΪ=" + message + ", ����=" + data + "]";
    }



}
