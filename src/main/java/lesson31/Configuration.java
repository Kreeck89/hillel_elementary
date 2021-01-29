package lesson31;

import java.util.Objects;

public class Configuration {
    private static Configuration configuration;
    private String config;

    private Configuration(String config) {
        this.config = config;
    }

    public static synchronized Configuration instance(String config) {
        if (Objects.isNull(configuration)) {
            configuration = new Configuration(config);
        }
        return configuration;
    }

    public String getConfig() {
        return config;
    }
}
