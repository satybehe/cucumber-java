package org.example.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Util {
    public static String readPropertyValue(String propertyName) throws IOException{
        Properties prop = readPropertiesFile("");
        return prop.getProperty(propertyName);
    }

    public static Properties readPropertiesFile(String fileName) throws IOException{
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
        finally {
            fis.close();
        }
        return prop;
    }
}
