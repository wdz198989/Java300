package ���ģʽ.command;

public class RemoteController {
    // ���ذ�ť������
    Command[] onCommands;
    Command[] offCommands;

    //ִ�г���������
    Command undoCommand;

    // ����������ɶ԰�ť�ĳ�ʼ��
    public RemoteController(){
        onCommands=new Command[5];
        offCommands=new Command[5];
        for (int i = 0; i < 5; i++) {
           onCommands[i]=new NoCommand();
           offCommands[i] = new NoCommand();
        }
    }
    // �����ǵİ�ť������Ҫ������
    public  void setCommand(int no ,Command onCommand,Command offCommand){
      onCommands[no]=onCommand;
      offCommands[no]=offCommand;
    }
    // ���¿���ť
    public  void onButtonWasPushed(int no ){
     // �ҵ����µĿ���ť�������ö�Ӧ����
        onCommands[no].execute();
        //��¼��β��������ڳ���
        undoCommand=onCommands[no];
    }
    // ���¹ذ�ť
    public  void offButtonWasPushed(int no ){
        // �ҵ����µĹذ�ť�������ö�Ӧ����
        offCommands[no].execute();
        //��¼��β��������ڳ���
        undoCommand=offCommands[no];
    }

    // ���³�����ť
    public  void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
