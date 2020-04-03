package 设计模式.command;

public class Client {
    public static void main(String[] args) {
        // 创建爱电灯对象（命令接收者）
        LightReceiver lightReceiver = new LightReceiver();
        // 创建开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
       // 需要一个遥控器
        RemoteController remoteController = new RemoteController();
        // 给我们的遥控器设置命令，比如no=0代表电灯
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("------ 按下电灯开的按钮------");
        remoteController.onButtonWasPushed(0);
        System.out.println("------ 按下电灯关的按钮------");
        remoteController.offButtonWasPushed(0);
        System.out.println("------ 按下电灯撤销的按钮------");
        remoteController.undoButtonWasPushed();

    }
}
