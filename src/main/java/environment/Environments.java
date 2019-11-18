package environment;

public class Environments {

    public static boolean isUnix() {
        String os = System.getProperty("os.name").toLowerCase();
        return (os.contains("nix") || os.contains("nux"));
    }
}
