package 设计模式.command;

public class LightOnCommand implements Command {
    // 聚合lightReceiver
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
