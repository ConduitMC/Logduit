package systems.conduit.logduit.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import systems.conduit.logduit.LogduitCommon;
import systems.conduit.logduit.LogduitPlugin;
import systems.conduit.main.api.mixins.ServerPlayer;
import systems.conduit.main.core.commands.BaseCommand;

import java.util.Optional;

/**
 * @author Innectic
 * @since 12/22/2020
 */
public class InfoModeToggle extends BaseCommand {

    @Override
    public LiteralArgumentBuilder<CommandSourceStack> getCommand() {
        return Commands.literal("info")
                .executes(ctx -> {
                    return 1;
                })
                .then(Commands.literal("toggle")).executes(ctx -> {
                    Optional<LogduitPlugin> plugin = LogduitPlugin.getPlugin(LogduitPlugin.class);
                    if (!plugin.isPresent()) {
                        ctx.getSource().sendFailure(LogduitCommon.Errors.INTERNAL_ERROR);
                        return 0;
                    }

                    // Make sure the command sender is actually a player
                    if (!(ctx.getSource() instanceof ServerPlayer)) {
                        ctx.getSource().sendFailure(LogduitCommon.Errors.NOT_PLAYER);
                        return 0;
                    }
                    ServerPlayer player = (ServerPlayer) ctx.getSource();

                    boolean state = plugin.get().getPlayerStateManager().toggleInfoMode(player);
                    ctx.getSource().sendSuccess(state ? LogduitCommon.Success.INFO_MODE_ENABLED : LogduitCommon.Success.INFO_MODE_DISABLED, true);
                    
                    return 1;
                });
    }
}
