package systems.conduit.logduit.listeners.logging;

import systems.conduit.main.core.events.EventListener;
import systems.conduit.main.core.events.annotations.Listener;
import systems.conduit.main.core.events.types.WorldEvents;

/**
 * @author Innectic
 * @since 12/22/2020
 */
public class BlockListeners implements EventListener {

    @Listener
    public void onBlockBreakEvent(WorldEvents.BlockBreakEvent e) {
    }

    @Listener
    public void onBlockPlaceEvent(WorldEvents.BlockPlaceEvent e) {
    }

    @Listener
    public void onBlockBurnEvent(WorldEvents.BlockBurnEvent e) {
    }

    @Listener
    public void onPlantGrowEvent(WorldEvents.GrowEvent e) {
    }
}
