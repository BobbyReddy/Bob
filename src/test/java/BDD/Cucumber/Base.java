package BDD.Cucumber;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;

	public static WebDriver getdriver() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hai\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		

		Properties prop = new Properties();
		FileInputStream fls = new FileInputStream(
				"C:\\Users\\Hai\\Desktop\\Selenium\\Cucumber\\src\\test\\java\\BDD\\Cucumber\\global_properties.properties");
		prop.load(fls);
		driver.get(prop.getProperty("url"));
		return driver;

	}

}
