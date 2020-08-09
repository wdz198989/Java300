package Java8.lamda;


/**
 * @Author : WuDazhong
 * @Date :2020/8/9 22:27
 * @Description :
 */
public class TestLamda2 {
    public static void main(String[] args) {
        ILove love = new Love();
        love.love(2);
    }
}

interface ILove{
    void love(int a );
}

class Love implements ILove{

    @Override
    public void love(int a) {
        System.out.println("i love you-->"+a);
    }
}
