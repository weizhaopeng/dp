package command.commands;

import command.device.Computer;
import command.device.Device;

public class ComputerCommand extends Command {
    public ComputerCommand(Device d) {
        this.D = d;
    }

    @Override
    public void execute(int statusDo) {
        Computer computer = (Computer)D;

        switch (statusDo) {
            case 0:
                computer.on();
                break;
            case 1:
                computer.off();
                break;
            case 2:
                computer.standBy();
                default:
        }
        this.statusLast = statusNow;
        this.statusNow = statusDo;
    }
}
