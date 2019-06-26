package command.controler;

import command.commands.Command;

public class Controler {
    Command command1 = null, command2 = null;

    public Controler(Command c1, Command c2) {
        this.command1 = c1;
        this.command2 = c2;
    }
    public void setCommand(Command c1, Command c2) {
        this.command1 = c1;
        this.command2 = c2;
    }

    public void lightOn() {
        command1.execute(0);
    }
    public void lightOff() {
        command1.execute(1);
    }
    public void computerOn() {
        command2.execute(0);
    }
    public void computerOff() {
        command2.execute(1);
    }
    public void computerStandBy() {
        command2.execute(2);
    }

    public void undo() {
        command1.undo();
        command2.undo();
    }
}
