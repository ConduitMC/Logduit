package systems.conduit.logduit;

import lombok.Getter;
import systems.conduit.logduit.commands.LogduitCommand;
import systems.conduit.logduit.util.PlayerStateManager;
import systems.conduit.main.core.plugin.Plugin;

/**
 * @author Innectic
 * @since 12/21/2020
 */
public class LogduitPlugin extends Plugin {

    @Getter private PlayerStateManager playerStateManager = new PlayerStateManager();

    @Override
    protected void onEnable() {
        registerCommands(new LogduitCommand());
    }

    @Override
    protected void onDisable() {
    }
}
