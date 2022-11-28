package configuration;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesProvider {

    private static final Logger log = LoggerFactory.getLogger(PropertiesProvider.class);

    private static Properties props;

    public static void loadProperties() {
        String profile = System.getProperty("test-profile", "local");
        log.info("Loading configuration from profile: {}", profile);
        InputStream propertiesAsStream = PropertiesProvider.class.getResourceAsStream("/properties/" + profile + ".properties");
        if (propertiesAsStream == null) {
            log.error("Properties file for profile {} does not exist.", profile);
            throw new IllegalStateException("Required profile not found.");
        }
        try {
            props = new Properties();
            props.load(propertiesAsStream);
        } catch (IOException e) {
            throw new IllegalStateException("Could not open file.", e);
        }
    }

    /**
     * Returns property from current profile
     *
     * @param property key of the property
     * @return returns value of the property, null if key does not exist
     */
    public static String getProperty(String property) {
        return getProperty(property, null);
    }

    /**
     * Returns property from current profile or default value if not found
     *
     * @param property     key of the property
     * @param defaultValue default value
     * @return value of the property, defaultValue if key does not exist
     */
    public static String getProperty(String property, String defaultValue) {
        if (props.containsKey(property)) {
            return props.getProperty(property);
        }
        return defaultValue;
    }

    public static String getEnvUrl() {
        return getProperty("env.url");
    }
}
