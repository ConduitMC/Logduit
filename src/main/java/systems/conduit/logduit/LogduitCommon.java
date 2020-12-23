package systems.conduit.logduit;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextComponent;

/**
 * @author Innectic
 * @since 12/22/2020
 */
public class LogduitCommon {

    private static final MutableComponent PREFIX = new TextComponent("Logduit> ").withStyle(s -> s.withBold(true).withColor(ChatFormatting.AQUA));

    public static class Errors {
        private static final Style ERROR_STYLE = Style.EMPTY.withBold(true).withColor(ChatFormatting.RED);

        public static final MutableComponent INTERNAL_ERROR = PREFIX.copy().append("An internal error has occurred!").withStyle(ERROR_STYLE);
        public static final MutableComponent NOT_PLAYER = PREFIX.copy().append("You are not a player!").withStyle(ERROR_STYLE);
    }

    public static class Success {
        private static final Style SUCCESS_STYLE = Style.EMPTY.withBold(true).withColor(ChatFormatting.GREEN);

        public static final MutableComponent INFO_MODE_ENABLED = PREFIX.copy().append("Info mode has been enabled!").withStyle(SUCCESS_STYLE);
        public static final MutableComponent INFO_MODE_DISABLED = PREFIX.copy().append("Info mode has been disabled!").withStyle(SUCCESS_STYLE);
    }
}
