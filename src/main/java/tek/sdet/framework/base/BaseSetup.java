package tek.sdet.framework.base;


import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import tek.sdet.framework.config.Browser;
import tek.sdet.framework.config.ChromeBrowser;
import tek.sdet.framework.config.ChromeHeadless;
import tek.sdet.framework.config.EdgeBrowser;
import tek.sdet.framework.config.FireFoxBrowser;
import tek.sdet.framework.utilities.ReadYamlFiles;

public class BaseSetup {
	
private static WebDriver webDriver;
private final ReadYamlFiles enviromentVariables;
public  static Logger Logger;

public BaseSetup() {
	 
	String filePath = System.getProperty("user.dir")+"/src/main/resources/env_config.yml";
	String log4jPath = System.getProperty("user.dir")+"/src/main/resources/log4j.properties";
	try {
		enviromentVariables= ReadYamlFiles.getInstance(filePath);
	}catch(FileNotFoundException e) {
		System.out.println( "failed for load enviroment context. check possible file path errors");
		throw new RuntimeException("failed for load enviroment context with message");
	}

        Logger = Logger.getLogger("logger_file");
      PropertyConfigurator.configure(log4jPath);
}
public WebDriver getDriver(){
	return webDriver;
	
	
}
public void setupBrowser() {
	
	HashMap uiProperties = enviromentVariables.getYamlProperty("ui");
	String url = uiProperties.get("url").toString().toLowerCase();
	Browser browser;
	switch(uiProperties.get("browser").toString().toLowerCase()) {
	
	
	case "chrome":
		if ((boolean)uiProperties.get("headless")) {
		browser = new ChromeHeadless();}
		else {
			browser = new ChromeBrowser();
		}
		webDriver= browser.openBrowser(url);
		break;
	case "edge":
		browser = new EdgeBrowser();
		webDriver = browser.openBrowser(url);
		break;
	
	case "firefox":
		browser = new FireFoxBrowser();
		webDriver = browser.openBrowser(url);
		break;
 
		default:
			throw new RuntimeException("unknown browser check enviroment properties");
	}webDriver.manage().window().maximize();
	webDriver.manage().timeouts().implicitlyWait(Duration.of(20, ChronoUnit.SECONDS)); 

}public void quitBrowser() {
	if (webDriver!= null)webDriver.quit();
}
}