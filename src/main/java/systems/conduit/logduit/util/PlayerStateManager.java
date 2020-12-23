package systems.conduit.logduit.util;

import systems.conduit.main.api.mixins.ServerPlayer;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author Innectic
 * @since 12/22/2020
 */
public class PlayerStateManager {

    private Map<UUID, Boolean> infoMode = new HashMap<>();

    public boolean isPlayerInInfoMode(ServerPlayer player) {
        return infoMode.getOrDefault(player.getUUID(), false);
    }

    public void setInfoMode(ServerPlayer player, boolean mode) {
        infoMode.put(player.getUUID(), mode);
    }

    public boolean toggleInfoMode(ServerPlayer player) {
        boolean newState = !isPlayerInInfoMode(player);
        setInfoMode(player, newState);
        return newState;
    }
}
