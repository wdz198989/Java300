package DesignPattern.command;
//创建命令接口
public interface Command {
    //执行某个动作
    public void execute();
    //撤销某个动作
    public void undo();
}
