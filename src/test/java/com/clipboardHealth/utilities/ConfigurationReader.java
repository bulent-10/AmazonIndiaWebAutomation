package com.clipboardHealth.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    // In this class we will implement the repeated steps of reading
    // from configuration.properties file

    // Create the object of Properties Class that comes from Java
    private static Properties properties = new Properties();

    static {
        // Get the path and open the file
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            // #3- Load the opened file into properties object
            properties.load(file);
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Use the object to read from the configuration.properties file
    public static String getProperty(String keyWord){return properties.getProperty(keyWord);}

}
