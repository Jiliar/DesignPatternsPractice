package behaviors.command.operations;

import behaviors.command.ICommand;
import behaviors.command.IDevice;

public class OnDevice implements ICommand {

    private IDevice device;

    public OnDevice(IDevice device) {
        this.device = device;
    }

    @Override
    public void operation() {
        this.device.on();
    }
}
