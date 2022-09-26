package demoIntializer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class DemoScreenshot {

	public WebDriver driver;
	public String Extentdate;

	public String getScreenshot(WebDriver driver, String screenShotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyy MM dd-hh mm ss").format(new Date());
		String Extentdate = new SimpleDateFormat("yyyy MM dd").format(new Date());

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		String destination = System.getProperty("user.dir") + "/Screenshot/Failed/" + screenShotName + "_" + dateName
				+ ".png";

		File finalDestination = new File(destination);
		Files.copy(source, finalDestination);
		return destination;
	}
}