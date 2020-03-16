package Exception20191211;


/**
 * @Author : WuDazhong
 * @Date :2019/12/11 21:40
 * @Description : 处理之后的测试
 */
public class TestDemo2 {

    /**
     * b呈现给客户c的方法1111。假设我们的打印是呈现给c的
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
            response.setMessage("数据转化成功，已将值放入data下。");
            response.setData(x);
        } catch (Exception e) {
            response.setCode(101);
            response.setMessage("输入的字符串含有除了数字以外其他类型的格式，数据错误！");
        }
        return response;

    }

}
