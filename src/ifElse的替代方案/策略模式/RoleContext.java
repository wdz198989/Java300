package ifElse���������.����ģʽ;


/**
 * @Author : WuDazhong
 * @Date :2020/4/2 20:06
 * @Description : �����湤��ģʽ����Ļ����ϣ����ղ���ģʽ��ָ��˼�룬����Ҳ������һ����ν�Ĳ����������࣬
 * ��������Ϊ RoleContext��
 */
public class RoleContext {
    // �ɸ����Ĳ��ԣ����벻ͬ�Ĳ��Զ���ҵ����Ӧ�仯

    private RoleOperation operation;

    public RoleContext(RoleOperation operation) {
        this.operation = operation;
    }

    public String execute(){
        return operation.op();
    }
}
