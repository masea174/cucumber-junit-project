package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

    public class Driver {

        //creating the private constructor we are clossing the access to the object from outside of this class
        private Driver(){}

        //we make the WebDriver private , because we want to close acces from otside of the class
        // we make it static because we will use it inside the static method
       // private static WebDriver driver;

        private static InheritableThreadLocal<WebDriver> driverPool=new InheritableThreadLocal<>();


        public static WebDriver getDriver(){
            //it will check if the driver is null and if its we will set uo browser inside the if statement
            //if you already have the driver set up it will return you that one otherway it will create you a driver

            if(driverPool==null){

                // we read the browser type from configuration reader class with get property
                String browserType=ConfigurationReader.getProperty("browser");
                switch (browserType){
                    default:
                    case"chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                    case"firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;

                }

            }return driverPool.get();
        }
        public static void closeDriver(){
            if(driverPool.get()!=null){
                driverPool.get().quit();// will kill the sesion so u need to assing the null value to the  singleton method to work
                driverPool.set(null);
            }}

    }


