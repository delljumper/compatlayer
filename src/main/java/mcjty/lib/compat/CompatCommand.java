package mcjty.lib.compat;

import net.minecraft.command.ICommand;

public interface CompatCommand extends ICommand {

    String getName();

    @Override
    default String getCommandName() {
        return getName();
    }
}
