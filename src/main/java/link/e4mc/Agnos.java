package link.e4mc;

import link.e4mc.fabric.AgnosImpl;

import java.nio.file.Path;

public class Agnos {
    public static boolean isClient() {
        return AgnosImpl.isClient();
    }

    public static Path configDir() {
        return AgnosImpl.configDir();
    }

    public static Path jarPath() {
        return AgnosImpl.jarPath();
    }
}
