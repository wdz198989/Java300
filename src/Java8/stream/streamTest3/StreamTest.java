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
 * @Description :���ݶ�������Խ���ȥ�ز���
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
            ������Ϊ��
                personIdΪ1�ģ�������Ϊhaha
                personIdΪ2�ģ�������Ϊhaha
            ��ΪTreeSet�ײ���ʹ��TreeMap����ʵ�ֵģ������˸���getPersonId���бȽϵıȽ���
            ���ж�personId��ͬʱ����ȽϽ��Ϊ0��Ȼ��ͻ��滻��valueֵ����keyֵ�ǲ���仯�ģ�
            ����ΪTreeSet�ǽ������Ԫ����Ϊkey�ģ�����ʹ��TreeSetʱ�����Ƚ����ȽϵĽ����ͬʱ���Բ��Ὣԭ����ֵ�滻�ɱȽϺ��ֵ
         */
        //�����ݶ�������Խ���ȥ�صĺ����ǣ������Ϸŵ�TreeSet�У�Ȼ���ٽ�TreeSetתΪList��
        // ����TreeSetҪ����һ�������ĸ����Խ��бȽϵıȽ�����
        // Ȼ��ʹ��public ArrayList(Collection<? extends E> c)��TreeSet���빹����������List��
        //�ȼ���
        System.out.println("=====================================");

        TreeSet<ExportTemperatureDto> treeSet = new TreeSet<>(Comparator.comparing(ExportTemperatureDto::getPersonId));
        for (ExportTemperatureDto temperatureDto : temperatureList){
            treeSet.add(temperatureDto);
        }
        List<ExportTemperatureDto> result2 =  new ArrayList<>(treeSet);
        result2.forEach(System.out::println);

    }
}
