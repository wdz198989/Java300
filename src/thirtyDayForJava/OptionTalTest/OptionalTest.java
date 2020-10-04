package thirtyDayForJava.OptionTalTest;


import org.junit.Test;

import java.util.Optional;
/**
 * Optional�ࣺΪ���ڳ����б�����ֿ�ָ���쳣�������ġ�
 *
 * ���õķ�����ofNullable(T t)
 *            orElse(T t)
 *
 * @author shkstart
 * @create 2019 ���� 7:24
 */
/**
 * @Author : WuDazhong
 * @Date :2020/10/2 10:05
 * @Description :
 */
public class OptionalTest {
    /*
Optional.of(T t) : ����һ�� Optional ʵ����t����ǿգ�
Optional.empty() : ����һ���յ� Optional ʵ��
Optional.ofNullable(T t)��t����Ϊnull

 */
    @Test
    public void test1(){
        Girl girl = new Girl();
//        girl = null;
        //of(T t):��֤t�Ƿǿյ�
        Optional<Girl> optionalGirl = Optional.of(girl);

    }

    @Test
    public void test2(){
        Girl girl = new Girl();
//        girl = null;
        //ofNullable(T t)��t����Ϊnull
        Optional<Girl> optionalGirl = Optional.ofNullable(girl);
        System.out.println(optionalGirl);
        //orElse(T t1):�����ǰ��Optional�ڲ���װ��t�Ƿǿյģ��򷵻��ڲ���t.
        //����ڲ���t�ǿյģ��򷵻�orElse()�����еĲ���t1.
        Girl girl1 = optionalGirl.orElse(new Girl("����ӱ"));
        System.out.println(girl1);

    }


    public String getGirlName(Boy boy){
        return boy.getGirl().getName();
    }

    @Test
    public void test3(){
        Boy boy = new Boy();
        boy = null;
        String girlName = getGirlName(boy);
        System.out.println(girlName);

    }
    //�Ż��Ժ��getGirlName():
    public String getGirlName1(Boy boy){
        if(boy != null){
            Girl girl = boy.getGirl();
            if(girl != null){
                return girl.getName();
            }
        }

        return null;

    }

    @Test
    public void test4(){
        Boy boy = new Boy();
        boy = null;
        String girlName = getGirlName1(boy);
        System.out.println(girlName);

    }

    //ʹ��Optional���getGirlName():
    public String getGirlName2(Boy boy){

        Optional<Boy> boyOptional = Optional.ofNullable(boy);
        //��ʱ��boy1һ���ǿ�
        Boy boy1 = boyOptional.orElse(new Boy(new Girl("�����Ȱ�")));

        Girl girl = boy1.getGirl();

        Optional<Girl> girlOptional = Optional.ofNullable(girl);
        //girl1һ���ǿ�
        Girl girl1 = girlOptional.orElse(new Girl("��������"));

        return girl1.getName();
    }

    @Test
    public void test5(){
        Boy boy = null;
        boy = new Boy();
        boy = new Boy(new Girl("����ʦ"));
        String girlName = getGirlName2(boy);
        System.out.println(girlName);

    }

}
