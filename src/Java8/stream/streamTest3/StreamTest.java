package Java8.stream.streamTest3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

/**
 * @Author : WuDazhong
 * @Date :2021/1/5 19:18
 * @Description :根据对象的属性进行去重操作
 */
public class StreamTest {
    public static void main(String[] args) {
        List<ExportTemperatureDto> temperatureList =  new ArrayList();
        temperatureList.add(new ExportTemperatureDto(1, "haha"));
        temperatureList.add(new ExportTemperatureDto(2, "haha"));
        temperatureList.add(new ExportTemperatureDto(3, "haha"));
        temperatureList.add(new ExportTemperatureDto(4, "haha"));

        temperatureList.add(new ExportTemperatureDto(1, "hahaasdas"));
        temperatureList.add(new ExportTemperatureDto(2, "hahaasdas"));

        List<ExportTemperatureDto> result = temperatureList.stream()
                .collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(comparing(ExportTemperatureDto::getPersonId))),ArrayList::new));
        result.forEach(System.out::println);

        /*
            输出结果为：
                personId为1的，其名称为haha
                personId为2的，其名称为haha
            因为TreeSet底层是使用TreeMap进行实现的，传入了根据getPersonId进行比较的比较器
            在判断personId相同时，其比较结果为0，然后就会替换其value值，而key值是不会变化的，
            又因为TreeSet是将传入的元素作为key的，所以使用TreeSet时，当比较器比较的结果相同时，以不会将原来的值替换成比较后的值
         */
        //理解根据对象的属性进行去重的核心是，将集合放到TreeSet中，然后再将TreeSet转为List，
        // 其中TreeSet要传入一个根据哪个属性进行比较的比较器，
        // 然后使用public ArrayList(Collection<? extends E> c)将TreeSet放入构造器中生成List。
        //等价于
        System.out.println("=====================================");

        TreeSet<ExportTemperatureDto> treeSet = new TreeSet<>(Comparator.comparing(ExportTemperatureDto::getPersonId));
        for (ExportTemperatureDto temperatureDto : temperatureList){
            treeSet.add(temperatureDto);
        }
        List<ExportTemperatureDto> result2 =  new ArrayList<>(treeSet);
        result2.forEach(System.out::println);

    }
}
