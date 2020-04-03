package ���ģʽ.command;

public class Client {
    public static void main(String[] args) {
        // ��������ƶ�����������ߣ�
        LightReceiver lightReceiver = new LightReceiver();
        // ������������
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
       // ��Ҫһ��ң����
        RemoteController remoteController = new RemoteController();
        // �����ǵ�ң���������������no=0������
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("------ ���µ�ƿ��İ�ť------");
        remoteController.onButtonWasPushed(0);
        System.out.println("------ ���µ�ƹصİ�ť------");
        remoteController.offButtonWasPushed(0);
        System.out.println("------ ���µ�Ƴ����İ�ť------");
        remoteController.undoButtonWasPushed();

    }
}
