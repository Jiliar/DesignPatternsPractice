package behaviors.command.operations;

import behaviors.command.ICommand;
import behaviors.command.IDevice;

public class OffDevice implements ICommand{
    private IDevice device;

    public OffDevice(IDevice device) {
        this.device = device;
    }

    @Override
    public void operation() {
        this.device.off();
    }
}
