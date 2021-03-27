package org.example.common;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    public WebDriver driver;

    public WebDriver initialiseDriver() throws IOException{
        String browser;
        if(System.getProperty(Constant.BROWSER) != null)
            browser = System.getProperty(Constant.BROWSER);
        else
            browser = Util.readPropertyValue("browser");
        
        switch (browser){
            case  "chrome":
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"src/main/config/chromerdriver.exe");
                driver = new ChromeDriver();
                 System.out.println("Chrome Driver Initialised");
                 break;
            case "firefox":
                System.out.println("firefox Initialised");

            case "safari":
                driver = new SafariDriver();
                System.out.println("safari Initialised");
                break;
            default:
                System.out.println("default Initialised");

        }
        return driver;
    }

    public Properties getProperty() throws IOException{
        Properties prop  = new Properties();
        String environment;
        if (System.getProperty(Constant.ENVIRONMENT) !=null)
            environment = System.getProperty(Constant.BROWSER);
        else
            environment = Util.readPropertyValue("environment");
        switch (environment){
            case "stage":
                prop.load(new FileInputStream(new File(System.getProperty("user.dir")+"/src/main/resources/stage_config.properties")));
                break;
            case "mtf":
                prop.load(new FileInputStream(new File(System.getProperty("user.dir")+"/src/main/resources/mtf_config.properties")));
                break;
            case "prod":
                prop.load(new FileInputStream(new File(System.getProperty("user.dir")+"/src/main/resources/prod_config.properties")));
                break;
            default:
                prop.load(new FileInputStream(new File(System.getProperty("user.dir")+"/src/main/resources/stage_config.properties")));
                break;
        }
        return prop;
    }

    public String takeScreenShot(String name, WebDriver driver) throws IOException{
        System.out.println("Taking Screenshot for:" +name);
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir")+"/src/main/java/org/example/screenshot/"+name+".png";
        File destination =  new File(dest);
        FileUtils.copyFile(srcFile, destination);
        return dest;
    }
}
