package ���ģʽ.command;

public class LightOnCommand implements Command {
    // �ۺ�lightReceiver
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();

    }

    @Override
    public void undo() {
         light.off();
    }
}
