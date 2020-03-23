package DesignPattern.command;

public class LightOffCommand implements Command {
    // ¾ÛºÏlightReceiver
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
       light.on();
    }
}
