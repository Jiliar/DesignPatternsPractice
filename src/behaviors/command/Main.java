package behaviors.command;

import behaviors.command.operations.OffDevice;
import behaviors.command.operations.OnDevice;

public class Main {

    public static void main (String args[]){
        IDevice tv = new TV();
        ICommand on = new OnDevice(tv);
        ICommand off = new OffDevice(tv);

        on.operation();
        off.operation();
    }

}
