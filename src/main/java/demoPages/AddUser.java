package demoPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demoIntializer.Browser;

public class AddUser extends Browser {

	public int rowcount3;
	AddUser userpage;

	@FindBy(xpath = "//button[text()='Add New User']")
	public static WebElement addusers;

	@FindBy(xpath = "//input[@name='first_name']")
	public static WebElement firstname;

	@FindBy(xpath = "//input[@name='last_name']")
	public static WebElement lastname;

	@FindBy(xpath = "//label[@for='checkbox-1']")
	public static WebElement role1;

	@FindBy(xpath = "//label[@for='checkbox-3']")
	public static WebElement role2;

	@FindBy(xpath = "//label[@for='checkbox-4']")
	public static WebElement role3;

	@FindBy(xpath = "//select[@name='language']")
	public static WebElement language;

	@FindBy(xpath = "//*[@id='GP_1']")
	public static WebElement locations;

	@FindBy(xpath = "//*[@id='GP_2']")
	public static WebElement department;

	@FindBy(xpath = "//*[@id='GP_3']")
	public static WebElement title;

	@FindBy(xpath = "//label[@for='user_with_nomail']")
	public static WebElement userdoesnothaveemailid;

	@FindBy(xpath = "//input[@name='username']")
	public static WebElement cusername;

	@FindBy(xpath = "//input[@name='password']")
	public static WebElement cpassword;

	@FindBy(xpath = "//label[@for='force_password_change']")
	public static WebElement forcetochange;

	@FindBy(xpath = "//input[@name='email']")
	public static WebElement priemail;

	@FindBy(xpath = "//label[@for='invite_later']")
	public static WebElement invitelater;

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement submit;

	@FindBy(xpath = "//*[@id='btnaddCancel']")
	public static WebElement cancel;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[3]/form/div/div/div[1]/div/div/div/span")
	public static WebElement firrequired;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[3]/form/div/div/div[2]/div/div/div/span")
	public static WebElement lasrequired;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[3]/form/div/div/div[8]/div/div/label")
	public static WebElement noemail;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public static WebElement usearch;

	@FindBy(xpath = "//div[@id='row-0']/div[1]/div/span[1]")
	public static WebElement searchname;

	@FindBy(xpath = "//div[@id='row-0']/div[3]/div")
	public static WebElement searchemail;

	@FindBy(xpath = "//div[@id='row-0']/div[2]/div/span/text()")
	public static WebElement searchusername;

	@FindBy(xpath = "//div[@id='row-1']/div[2]/div")
	public static WebElement searchusername1;

	@FindBy(xpath = "//div[@id='row-0']/div[5]/div/i[1]")
	public static WebElement edit;

	@FindBy(xpath = "//div[@id='row-1']/div[5]/div/i[1]")
	public static WebElement edit1;

	@FindBy(xpath = "//div[@id='row-0']/div[5]/div/i[2]")
	public static WebElement delete;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[3]/form/div/div/div[12]/div[1]/div[1]/div/div/span")
	public static WebElement passwordlen;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[3]/form/div/div/div[10]/div/div/div/p")
	public static WebElement emailidalreadyexist;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[3]/form/div/div/div[10]/div/div/div/p")
	public static WebElement useralreadyexist;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[3]/form/div/div/div[12]/div[1]/div[1]/div/div/span")
	public static WebElement passwordreq;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[3]/form/div/div/div[10]/div/div/div/span")
	public static WebElement usernamereq;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[3]/form/div/div/div[3]/div/span")
	public static WebElement rolereq;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[3]/form/div/div/span")
	public static WebElement emailreq;

	@FindBy(xpath = "//div[@class='toast-body']")
	public static WebElement successmsg;

	@FindBy(xpath = "//*[@id='main-content']/div[1]/div/div[2]/div/div/div/div")
	public static WebElement norecordsfound;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[1]/div/div/div/input")
	public static WebElement editfirstname;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[2]/div/div/div/input")
	public static WebElement editlastname;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[3]/div/div/div[1]/div/label")
	public static WebElement editrole1;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[3]/div/div/div[2]/div/label")
	public static WebElement editrole2;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[3]/div/div/div[3]/div/label")
	public static WebElement editrole3;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[3]/div/span")
	public static WebElement editrolerequired;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[2]/div/div/div/span")
	public static WebElement editlasrequired;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[1]/div/div/div/span")
	public static WebElement editfirrequired;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[7]/div/div/div/label")
	public static WebElement status;

	@FindBy(xpath = "//button[text()='Submit']")
	public static WebElement editsubmit;

	@FindBy(xpath = "//*[@id='btnaddCancel']")
	public static WebElement editcancel;

	@FindBy(xpath = "//*[@id='sub-heading']/span[2]")
	public static WebElement editemail;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[1]/div/div/div/input")
	public static WebElement editpriemail;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[1]/span")
	public static WebElement editpriemailrequired;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[2]/button[1]")
	public static WebElement editemailsubmit;

	@FindBy(xpath = "//*[@id='sub-heading']/span[3]")
	public static WebElement editresetpassword;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[1]/div/div/div/input")
	public static WebElement editpassword;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[1]/div/div/div/span")
	public static WebElement editpasswordrequired;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[4]/button[1]")
	public static WebElement editpwdsubmit;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[1]/div[2]/div/div/input")
	public static WebElement edituseremail;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[1]/div[2]/div/div/p")
	public static WebElement editemailalreadyexist;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[1]/div[2]/div/div/span")
	public static WebElement editemailspaceinfront;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[1]/div/div/div/span")
	public static WebElement editpasswordatleast;

	@FindBy(xpath = "//a[text()='Training']")
	public static WebElement edittraining;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public static WebElement edittrainingsearch;

	@FindBy(xpath = "//div[@class='modal-content']/div/div/input")
	public static WebElement edittrainingassignsearch;

	@FindBy(xpath = "//ul[@class='list-group']//span[@class='checkmark']")
	public static WebElement editcheckbox;

	@FindBy(xpath = "//div[@class='ssi-feeds-commentsActionBtn']/button[text()='Assign']")
	public static WebElement editcheckboxassign;

	@FindBy(xpath = "//button[text()='Unassign']")
	public static WebElement editunassign;

	@FindBy(xpath = "//div[text()='There are no records to display']")
	public static WebElement edittrainingnorecordfound;

	@FindBy(xpath = "//button[text()='Assign Courses']")
	public static WebElement editassigncourse;

	@FindBy(xpath = "//*[@id='main']/div[5]/div/div/div[2]/div[3]/ul/li/label/span")
	public static WebElement editnocourse;

	@FindBy(xpath = "//button[text()='Assign']")
	public static WebElement editassign;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[3]/ul/li[3]/a")
	public static WebElement editchannels;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[4]/div/div[2]/div[1]/header[2]/div/div/button")
	public static WebElement editchannelassign;

	@FindBy(xpath = "//*[@id='main']/div[5]/div/div/div[2]/div[2]/input")
	public static WebElement editchannelsearch;

	@FindBy(xpath = "//*[@id='main']/div[5]/div/div/div[2]/div[3]/ul/li[1]/label/span[1]")
	public static WebElement editchannelcheckbox;

	@FindBy(xpath = "//*[@id='main']/div[5]/div/div/div[2]/div[2]/input")
	public static WebElement editchannelassigncourse;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[3]/ul/li[4]/a")
	public static WebElement editdatapermission;

	@FindBy(xpath = "//*[@id='grpTypes']")
	public static WebElement editgrouptype;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[4]/div/div[1]/div/div/div/div")
	public static WebElement editdatapermissionmsg;

	@FindBy(xpath = "//*[@id='main']/div[5]/div/div/div[2]/input")
	public static WebElement editdatapermissionassignsearch;

	@FindBy(xpath = "//*[@id='main']/div[5]/div/div/div[2]/div/ul/li[2]/label/span[1]")
	public static WebElement editdatapermissionassigncheckbox;

	@FindBy(xpath = "//*[@id='assign']")
	public static WebElement editdatapermissionassign;

	@FindBy(xpath = "//*[@id='main']/div[5]/div/div/div[2]/div[3]/ul/li/label/span")
	public static WebElement editnochannels;

	@FindBy(xpath = "//span[text()='There are no records to display']")
	public static WebElement editdatapermissionnorecords;

	@FindBy(xpath = "//div[@id='row-0']/div[5]/div/i[3]")
	public static WebElement invitereinvitereverify;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[2]/div[2]/div/button[2]")
	public static WebElement deletepopup;

	@FindBy(xpath = "//*[@id='login-toastmsg']/div")
	public static WebElement invaliduser;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[3]/form/div/div/div[10]/div/div/div/span")
	public static WebElement emailvalidation;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[2]/div/button")
	public static WebElement generatepwd;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[3]/div[1]/div/label")
	public static WebElement forcetheuser;

	@FindBy(xpath = "//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[3]/div[2]/div/label")
	public static WebElement notifynewpassword;

	@FindBy(xpath = "//button[@class='close']/span[@aria-hidden='true']")
	public static WebElement exit;

	public void status1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement status1 = driver
				.findElement(By.xpath("//*[@id='main']/div[3]/div/div/div[5]/form/div/div/div[7]/div/div/div/label"));
		js.executeScript("arguments[0].click()", status1);
	}

	public void adduserstatus() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement status1 = driver
				.findElement(By.xpath("//*[@id='main']/div[3]/div/div/div[3]/form/div/div/div[7]/div/div/div/label"));
		js.executeScript("arguments[0].click()", status1);
	}

	public AddUser() {
		PageFactory.initElements(driver, this);
	}

	public void adduserclick() {
		addusers.click();
	}

	public AddUser firstname() {
		firstname.sendKeys(wb.getSheet("Utility").getRow(6).getCell(0).getStringCellValue());
		return new AddUser();
	}

	public void lastname() {
		lastname.sendKeys(wb.getSheet("Utility").getRow(6).getCell(1).getStringCellValue());
	}

	public void role() {
		if (role1.getText().equals(wb.getSheet("Utility").getRow(6).getCell(2).getStringCellValue())) {
			role1.click();
		}
		if (role2.getText().equals(wb.getSheet("Utility").getRow(6).getCell(3).getStringCellValue())) {
			role2.click();
		}
		if (role3.getText().equals(wb.getSheet("Utility").getRow(6).getCell(4).getStringCellValue())) {
			role3.click();
		}
	}

	public void location() {
		List<WebElement> options = locations.findElements(By.xpath("//select[@id='GP_1']/option"));
		for (WebElement option : options) {
			if (wb.getSheet("Utility").getRow(6).getCell(5).getStringCellValue().equals(option.getText())) {
				option.click();
			}
		}
	}

	public void department() {
		List<WebElement> options = department.findElements(By.xpath("//select[@id='GP_2']/option"));
		for (WebElement option : options) {
			if (wb.getSheet("Utility").getRow(6).getCell(6).getStringCellValue().equals(option.getText())) {
				option.click();
			}
		}
	}

	public void title() {
		List<WebElement> options = title.findElements(By.xpath("//select[@id='GP_3']/option"));
		for (WebElement option : options) {
			if (wb.getSheet("Utility").getRow(6).getCell(7).getStringCellValue().equals(option.getText())) {
				option.click();
			}
		}
	}

	public void movetoemailid() {
		Actions action = new Actions(driver);
		action.moveToElement(submit).build().perform();
		// priemail.sendKeys(wb.getSheet("Users").getRow(13).getCell(12).getStringCellValue());
	}

	public void movetofirstname() {
		Actions action = new Actions(driver);
		action.moveToElement(firstname).build().perform();
		// priemail.sendKeys(wb.getSheet("Users").getRow(13).getCell(12).getStringCellValue());
	}

	public void movetoeditsubmit() {
		Actions action = new Actions(driver);
		action.moveToElement(editsubmit).build().perform();
		// priemail.sendKeys(wb.getSheet("Users").getRow(13).getCell(12).getStringCellValue());
	}

	public void invitelater() {
		invitelater.click();
	}

	public void noemail() {
		// Actions action=new Actions(driver);
		// action.moveToElement(noemail).build().perform();
		noemail.click();
	}

	public void username() {
		cusername.sendKeys(wb.getSheet("Utility").getRow(6).getCell(8).getStringCellValue());
	}

	public void password() {
		cpassword.sendKeys(wb.getSheet("Utility").getRow(6).getCell(9).getStringCellValue());
	}

	public void status() {

		// Actions action=new Actions(driver);
		// action.click(status).build().perform();
		// action.moveToElement(status).moveByOffset(124,
		// 0).click().build().perform();
		// action.moveToElement(status).contextClick().build().perform();
		// Actions build = new Actions(driver);
		// build.MoveToElement(FindElement(By.xpath("ext-gen33"))).MoveByOffset(124,
		// 0).Click().Build().Perform();
		// String pseudo = ((JavascriptExecutor)driver)
		// .executeScript("return window.getComputedStyle(arguments[0],
		// ':before')

	}

	public AddUser submit() throws InterruptedException {
		// Actions action=new Actions(driver);
		// action.moveToElement(submit).build().perform();
		Thread.sleep(1000);
		submit.click();

		return new AddUser();
	}

	public void firrequired() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(firstname).build().perform();
		Thread.sleep(1000);
		// return firrequired.getText();
	}
}