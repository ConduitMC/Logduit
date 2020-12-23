package systems.conduit.logduit.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import systems.conduit.main.core.commands.BaseCommand;

/**
 * @author Innectic
 * @since 12/22/2020
 */
public class LogduitCommand extends BaseCommand {

    @Override
    public LiteralArgumentBuilder<CommandSourceStack> getCommand() {
        return Commands.literal("log")
                .then(new InfoModeToggle().getCommand());
    }
}
