package com.example.sadhana_maven;

import java.io.InputStream;
import java.util.Properties;

public class App {

    public static void main(String[] args) {

        try {
            InputStream input =
                    App.class.getClassLoader()
                            .getResourceAsStream("config.properties");

            Properties properties = new Properties();

            if (input != null) {
                properties.load(input);

                System.out.println("Application: "
                        + properties.getProperty("app.name"));

                System.out.println("Version: "
                        + properties.getProperty("app.version"));

                System.out.println("Message: "
                        + properties.getProperty("app.message"));

                input.close();
            } else {
                System.out.println("config.properties not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
