package support;

import io.github.cdimascio.dotenv.Dotenv;

public class Config {
    private static final Dotenv dotenv = Dotenv.load();

    public static String getBaseUrl() {
        return dotenv.get("BASE_URL");
    }
    public static String getBrowser() {
        return dotenv.get("BROWSER");
    }
    public static String getUsername() {
        return dotenv.get("USUARIO");
    }
    public static String getPassword() {
        return dotenv.get("SENHA");
    }
    public static String getMediaPath(){
        return dotenv.get("MEDIA_PATH");
    }
    public static Boolean getHEADLESS(){
        return dotenv.get("HEADLESS").equals("1");
    }
}
