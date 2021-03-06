package Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Config conf = null;
    public Properties prop;
    public FileInputStream file;

    public Config() throws IOException {
        prop = new Properties();
        file = new FileInputStream("C:\\Users\\athira-hp\\IdeaProjects\\ICTAssignmentBookMyShow\\src\\main\\resources\\config.properties");
        prop.load(file);
        file.close();
    }

    public static Config ConfigReturn() throws IOException {
        return new Config();
    }

    public String get(String key) {
        return prop.getProperty(key);
    }
}
