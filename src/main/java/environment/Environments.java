package environment;


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
     * Method isCheckOSSystem.
     * If method return true, that is automation scripts to run on OS Unix or Linux.
     * If method return false, that is automation scripts to run on OS Windows or Mac.
     *
     * @return the boolean.
     */
    public static boolean isCheckOSSystem() {
        final String nameSystem = System.getProperty("os.name").toLowerCase();
        return (nameSystem.contains("nix") || nameSystem.contains("nux"));
    }
}
