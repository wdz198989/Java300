package Exception20191211;


/**
 * @Author : WuDazhong
 * @Date :2019/12/11 21:38
 * @Description : 定义返回结果的类
 */
public class ResponseDemo<T> {

    private Integer code;	//错误代码，100为正确，101为错误
    private String message;	//错误信息
    private T data;			//转换后的数值存放处
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
        return "ResponseDemo [错误编码为=" + code + ", 错误信息为=" + message + ", 数据=" + data + "]";
    }



}
