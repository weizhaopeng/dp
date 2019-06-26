package command.device;

public class Light extends Device {
    public void on() {
        System.out.println("\n***灯已开***\n");
    }
    public void off() {
        System.out.println("\n***灯已关***\n");
    }
}
