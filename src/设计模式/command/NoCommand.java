package 设计模式.command;
// 没有任何命令，即空执行：用于初始化每个按钮，当调用空命令时，什么也不做。
public class NoCommand implements Command {


    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
