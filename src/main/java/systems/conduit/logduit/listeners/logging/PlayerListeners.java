package systems.conduit.logduit.listeners.logging;

import systems.conduit.main.core.events.EventListener;
import systems.conduit.main.core.events.annotations.Listener;
import systems.conduit.main.core.events.types.PlayerEvents;

/**
 * @author Innectic
 * @since 12/22/2020
 */
public class PlayerListeners implements EventListener {

    @Listener
    public void onPlayerJoinEvent(PlayerEvents.PlayerJoinEvent e) {
    }

    @Listener
    public void onPlayerLeaveEvent(PlayerEvents.PlayerLeaveEvent e) {
    }

    @Listener
    public void onPlayerChatEvent(PlayerEvents.PlayerChatEvent e) {
    }
}
