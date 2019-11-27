package environment;

import java.util.Locale;

/**
 * The class Environments.
 */
public final class Environments {

    /**
     * The private constructor.
     */
    private Environments() {
    }

    /**
     * Method isCheckOperatingSystem.
     * If method return true, that is automation scripts to run on OS Unix or Linux.
     * If method return false, that is automation scripts to run on OS Windows or Mac.
     *
     * @return the boolean.
     */
    public static boolean isCheckOperatingSystem() {
        final String nameSystem = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        return (nameSystem.contains("nix") || nameSystem.contains("nux"));
    }
}
