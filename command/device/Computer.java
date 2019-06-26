package command.device;

public class Computer extends Device {

    @Override
    public void on() {
        System.out.println("\n***电脑开机***\n");
    }

    @Override
    public void off() {
        System.out.println("\n***电脑关机***\n");
    }

    public void standBy() {
        System.out.println("\n***电脑进入待机状态***\n");
    }
}
