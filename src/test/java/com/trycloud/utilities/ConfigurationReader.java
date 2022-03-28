package com.trycloud.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1- create the object of properties
   private static Properties properties = new Properties();

    static {


        try {
            //2- we need to open the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //3- load the properties object using fileinputstream
            properties.load(file);

            //close the file
            file.close();

        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class");
        }

    }


    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
