package Java8.fruit191214;


import java.util.Comparator;

/**
 * @Author : WuDazhong
 * @Date :2019/12/14 23:28
 * @Description :
 */
public class FruitComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        int compare = s1.compareToIgnoreCase(s2);

        return compare;
    }
}
