package thirtyDayForJava.TestThis;


/**
 * @Author : WuDazhong
 * @Date :2020/10/11 8:57
 * @Description : ≤‚ ‘return this
 */
public class ReturnThisTest {


        public static void main(String[] args) {
            ReturnThisTest t= new ReturnThisTest();
            t.A().B();
        }

       ReturnThisTest A() {
            System.out.println("A");
            return this;
        }
        void B() {
            System.out.println("B");
        }


}
