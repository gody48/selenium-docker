package demoIntializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static WebDriver driver;
	public FileInputStream inputStream;
	public FileOutputStream outputstream;
	public ExtentTest test;
	String location = System.getProperty("user.dir") + ("/RunAndTestData/TestData.xlsx");
	// String location="";
	public ExtentReports reports;
	public File file;
	public XSSFWorkbook wb;
	public static XSSFSheet sheet1, sheet2;

	public int rowcount1, rowcount2;

	public Browser() {
		try {
			file = new File(location);
			inputStream = new FileInputStream(file);
			wb = new XSSFWorkbook(inputStream);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// sheet1 =wb.getSheet("Utility");

		// rowcount1=sheet1.getLastRowNum()-sheet1.getFirstRowNum();
		// sheet2=wb.getSheet("LoginData");
		// rowcount2=sheet2.getLastRowNum()-sheet2.getFirstRowNum();
	}

	public String getstringdata(String sheetname, int row, int column) {
		String data = wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	public void ExcelWrite() throws IOException {
		outputstream = new FileOutputStream(file);
		// String msg="Pass";
		wb.write(outputstream);
		// outputstream.close();
	}

	public WebDriver LaunchBrowser() {
		// location="C:/Users/karthi/workspace/YF/src/main/java/Utility/Drivers/Testcases.xlsx";

		String browsername = (wb.getSheet("Utility").getRow(2).getCell(3).getStringCellValue());
		if (browsername.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			// sheet1.getRow(1).getCell(2).setCellValue("Chrome Launch");
		} else if (browsername.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			// sheet1.getRow(1).getCell(2).setCellValue("Firefox Launch");
		} else if (browsername.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browsername.equals("Opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		} else if (browsername.equals("Safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		} else {
			sheet1.getRow(1).getCell(2).setCellValue("Browser Not Found");
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(wb.getSheet("Utility").getRow(2).getCell(2).getStringCellValue());
		return driver;
	}
	// public ExtentReports InitReport() {
	// reports=new
	// ExtentReports(System.getProperty("user.dir")+"\\loginpage.html",false);
	// return reports;
	// }
}
