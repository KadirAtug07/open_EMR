package openEmr.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream("Configuration.properties");
            properties=new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println("Failed to read properties");
            e.printStackTrace();
        }
    }
    public static String getProperties(String key){
        return properties.getProperty(key);
    }
}
