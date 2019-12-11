package Exception20191211;


/**
 * @Author : WuDazhong
 * @Date :2019/12/11 21:35
 * @Description : 没有经过处理的之前
 *
 * 当程序运行过程中发生错误时，就会“ 抛出异常'，抛出异常比终止程序要灵活得多，这是因为可以提供一个“ 捕获” 异常的处理器 （handler) 对异常情况进行处理。
 *
 * 如果没有提供处理器，程序就会终止，并在控制台上打印出一条信息， 其中给出了异常的类型。可能在前面已经看到过一些异常报告， 例如， 偶然使用了 null 引用或者数组越界等。
 *
 * 异常有两种类型： 未检查异常和已检查异常。 对于已检查异常， 编译器将会检查是否提供了处理器。 然而，有很多常见的异常， 例如，访问 null 引用， 都属于未检查异常。编译器不会査看是否为这些错误提供了处理器。毕竟，应该精心地编写代码来避免这些错误的发生， 而不要将精力花在编写异常处理器上。
 *
 *
 *
 * 下面我们举一个try...catch的小例子，
 *
 * 假如程序员a提供了一个方法借口供程序员b使用，b用它实现某些功能，最后呈现给客户c。

 */
public class TestDemo {

    /**
     * b呈现给客户c的方法。假设我们的打印是呈现给c的
     * @param args
     * @throws Exception
     */
    public static void main(String[] args){
        String num = "1234tr";
        System.out.println(numberFormat(num));
    }



    /**
     * a提供的数据转换的借口
     * @param num
     * @return
     */
    public static int  numberFormat(String num) {
        int x = Integer.parseInt(num);
        return x;

    }

}
