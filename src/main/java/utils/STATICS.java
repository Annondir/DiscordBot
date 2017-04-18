package utils;

import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;

public class STATICS {

    public static String TOKEN = "";

    //######### GENERAL BOT SETTINGS #########//

    public static String VERSION = "1.19.8.0";

    public static String PREFIX = "-";

    public static OnlineStatus STATUS = OnlineStatus.ONLINE;

    public static String CUSTOM_MESSAGE = "ゼクロ";

    public static Game GAME = new Game()  {
        public String getName() {
            return CUSTOM_MESSAGE + " | -help | v." + VERSION;
        }
        public String getUrl() {
            return "http://zekro.de";
        }
        public GameType getType() {
            return GameType.DEFAULT;
        }
    };



    //######### WARFRAME ALERTS SETTINGS #########//

    public static int refreshTime = 10;

    public static String warframeAlertsChannel = "warframealerts";

    public static boolean enableWarframeAlerts = true;



    //######### PERMISSION SETTINGS #########//

    public static String[] botPermRoles = {"Bot Commander", "Moderator", "Admin", "Owner"};

    public static String guildJoinRole = "";


    //########## GOOGLE DOCS ID'S ##########//

    public static String DOCID_warframeAlertsFilter = "13O2lZ_UemLDkCV8425XHOPSZ3aVoeYmV5cF_vLQAyEY";

    public static String DOCID_jokes = "1fWHPIrZKHSXBsF5SWO3ZEHmecItVppYvM39pm7Rvssk";

    //########### OTHER SETTINGS ###########//

    public static String voiceLogChannel = "voicelog";

    public static String musicChannel = "mucke";

    public static boolean commandConsoleOutout = true;

    public static String KICK_VOICE_CHANNEL = "";

    public static String TTT_SERVER_IP = "";

    public static int TTT_SERVER_PORT = 27015;

    public static boolean autoUpdate = true;

    public static int music_volume = 10;


}
