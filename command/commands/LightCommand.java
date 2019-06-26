package command.commands;

import command.device.Device;

public class LightCommand extends Command {

    public LightCommand(Device d) {
        this.D = d;
    }

    @Override
    public void execute(int statusDo) {
        switch (statusDo) {
            case 0:
                D.on();
                break;
            case 1:
                D.off();
                break;

            default:
        }
        this.statusLast = statusNow;
        this.statusNow = statusDo;
    }
}
