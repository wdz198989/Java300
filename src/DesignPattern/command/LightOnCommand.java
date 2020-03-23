package DesignPattern.command;

public class LightOnCommand implements Command {
    // ¾ÛºÏlightReceiver
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
