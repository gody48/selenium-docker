package DemoYouFactors.DemoYouFactors;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import demoIntializer.Browser;
import demoIntializer.DemoScreenshot;
import demoPages.AddUser;
import demoPages.Courses;
import demoPages.Menus;
import demoPages.SignIn;

public class UserLaunch extends Browser {

	SignIn signin;
	Menus menus;
	AddUser userpage;
	Courses coursepage;
	XSSFSheet sheet2;
	public DemoScreenshot testutil;
	ExtentTest test;
	ExtentReports reports;
	File file;
	FileInputStream inputstream;
	XSSFSheet sheet;
	XSSFWorkbook wb;

	public UserLaunch() throws IOException {

		super();
	}

	@BeforeClass
	public void launch() throws IOException, InterruptedException {

		LaunchBrowser();

		// loginpage.adminlogin();
		Thread.sleep(1000);
	}

	@BeforeMethod
	public void excel() throws IOException {
		String location = System.getProperty("user.dir") + ("/RunAndTestData/TestData.xlsx");
		file = new File(location);
		inputstream = new FileInputStream(file);
		wb = new XSSFWorkbook(inputstream);
		testutil = new DemoScreenshot();
		signin = new SignIn();
		menus = new Menus();
		userpage = new AddUser();
		coursepage = new Courses();
	}

	@Test(priority = 1)
	public void ALogin() {
		signin.adminlogin();
		String title = menus.getdashboard();
		Assert.assertEquals(title, "Dashboard", "Admin Login successfully");
	}

	@Test(priority = 2)
	public void AddUserAssignCourse() throws InterruptedException {
		menus.usermgm();
		menus.users.click();
		userpage.adduserclick();
		Thread.sleep(1000);
		userpage.firstname.sendKeys(wb.getSheet("Utility").getRow(6).getCell(0).getStringCellValue());
		userpage.lastname.sendKeys(wb.getSheet("Utility").getRow(6).getCell(1).getStringCellValue());
		userpage.role3.click();
		userpage.location();
		userpage.department();
		userpage.title();
		userpage.userdoesnothaveemailid.click();
		Thread.sleep(2000);
		userpage.cusername.sendKeys(wb.getSheet("Utility").getRow(6).getCell(8).getStringCellValue());
		userpage.cpassword.sendKeys(wb.getSheet("Utility").getRow(6).getCell(9).getStringCellValue());
		userpage.submit();
		Thread.sleep(2000);
		driver.navigate().refresh();
		userpage.usearch.click();
		userpage.usearch.sendKeys(wb.getSheet("Utility").getRow(6).getCell(10).getStringCellValue());
		Thread.sleep(2000);
		userpage.edit.click();
		Thread.sleep(2000);
		userpage.edittraining.click();
		Thread.sleep(2000);
		userpage.editassigncourse.click();
		Thread.sleep(2000);
		userpage.edittrainingassignsearch.click();
		userpage.edittrainingassignsearch.sendKeys(wb.getSheet("Utility").getRow(6).getCell(11).getStringCellValue());
		userpage.editcheckbox.click();
		userpage.editcheckboxassign.click();
		Thread.sleep(3000);
		Assert.assertTrue(userpage.successmsg.isDisplayed(), "The changes are updated successfully");
	}

	@Test(priority = 3)
	public void AdminLogout() throws InterruptedException {
		userpage.exit.click();
		Thread.sleep(3000);
		signin.profileimg.click();
		Thread.sleep(2000);
		signin.logout.click();
		Thread.sleep(3000);
		String title = signin.validatesignin();
		Assert.assertEquals(title, "Sign In", "Admin Logout successfully");
	}

	@Test(priority = 4)
	public void UserCourseComplete() throws InterruptedException {

		signin.username.sendKeys(wb.getSheet("Utility").getRow(6).getCell(8).getStringCellValue());
		signin.password.sendKeys(wb.getSheet("Utility").getRow(6).getCell(9).getStringCellValue());
		signin.login.click();
		Thread.sleep(4000);
		coursepage.coursesearch.click();
		Thread.sleep(4000);
		coursepage.coursesearch.sendKeys(wb.getSheet("Utility").getRow(6).getCell(11).getStringCellValue());
		Thread.sleep(4000);
		coursepage.coursesimg.click();
		Thread.sleep(4000);
		coursepage.russianunit1.click();
		Thread.sleep(4000);
		coursepage.russianunit1capsulelist.click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		coursepage.russianunit1module.click();
		Thread.sleep(4000);
		String title = coursepage.getunitname();
		Assert.assertEquals(title, "Введение и обзор", "CourseLaunch verfied");
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			String location = System.getProperty("user.dir") + ("/Screenshot/CourseLaunch/");
			String name = wb.getSheet("Utility").getRow(6).getCell(11).getStringCellValue();
			Files.copy(screenshot, new File(location + name + ".png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		Thread.sleep(6000);
	}

	@AfterMethod
	public void teardown(ITestResult result) throws InterruptedException, IOException {
		if (result.getStatus() == result.FAILURE || result.getStatus() == result.SKIP) {
			String screenshotPath = testutil.getScreenshot(driver, result.getName());
			result.setAttribute("screenshotPath", screenshotPath); // sets the
																	// value the
																	// variable/attribute
																	// screenshotPath
																	// as the
																	// path of
																	// the
																	// sceenshot
		}
		Thread.sleep(2000);
		// driver.quit();
	}

	@AfterClass
	public void endtest() {
		// reports.flush();
		// reports.endTest(test);
		driver.quit();

	}
}
