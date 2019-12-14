package Java8.fruit191214;


/**
 * @Author : WuDazhong
 * @Date :2019/12/14 23:31
 * @Description :
 */
public class NonFunctionalFruitComparator {

    public  int compare2(String s1,String s2){
        int compare = s1.compareToIgnoreCase(s2);
        return  compare;

    }
}
