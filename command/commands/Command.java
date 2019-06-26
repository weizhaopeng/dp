package command.commands;

import command.device.Device;
/*TODO 状态码
    0：关闭
    1：打开
    2：...
 */
public abstract class Command {
    Device D = null;
    int statusLast = 1, statusNow = 1;

    public abstract void execute(int statusDo);
    public void setDevice (Device d) {
        this.D = d;
    }
    public void undo() {
        execute(statusLast);
    }
}
