package demoPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demoIntializer.Browser;

public class Courses extends Browser {

	Courses coursepage;

	@FindBy(xpath = "//*[@id='main-content']/div[1]/div/div/div/div/div[1]/input")
	public static WebElement coursesearch;

	@FindBy(xpath = "//*[@id='main-content']/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/p")
	public static WebElement coursesimg;

	@FindBy(xpath = "//*[@id='main-content']/div[1]/div/div/div/div[2]/div[1]/div/div/div[2]/p")
	public static WebElement russianunit1;

	@FindBy(xpath = "//*[@id='main-content']/div[1]/div/div/div/div[2]/div/div[1]/div/div/div[2]/div[1]/p")
	public static WebElement russianunit1capsulelist;

	@FindBy(xpath = "//*[@id='main-content']/div/div/div/div/section/div/section/div/div/div/div/table/tbody/div/tr/td[1]")
	public static WebElement russianunit1module;

	@FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/nav/div/ul[1]/li[2]")
	public static WebElement verifyunitname;

	public String getunitname() {
		return verifyunitname.getText();
	}

	public Courses() {
		PageFactory.initElements(driver, this);
	}

	/*
	 * JavascriptExecutor js=(JavascriptExecutor)driver;
	 * driver.switchTo().frame(0); WebElement
	 * bookmark=driver.findElement(By.xpath(
	 * "/html/body/div[3]/div/div/div[2]/button[1]")); bookmark.click();
	 * Thread.sleep(10000); WebElement intropage=driver.findElement(By.xpath(
	 * "//*[@id='main-content']/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/p"
	 * )); intropage.click(); WebElement
	 * compareintro=driver.findElement(By.xpath(
	 * "/html/body/div/div/div/div[3]/div/div/div/div/section/div[1]/section/div[1]/div/h3/span[1]"
	 * )); if(intropage.getText().equals(compareintro.getText())){
	 * Thread.sleep(10000); driver.findElement(By.xpath(
	 * "//*[@id='main-content']/div[1]/div/div/div/div[2]/div[1]/div/div/div[1]/div"
	 * )).click();
	 * 
	 * Thread.sleep(10000); driver.findElement(By.xpath(
	 * "//*[@id='main-content']/div[1]/div/div/div/div[2]/div/div[1]/div/div/div[1]/div"
	 * )).click(); Thread.sleep(10000); driver.findElement(By.xpath(
	 * "//*[@id='main-content']/div/div/div/div/section/div/section/div/div/div/div/table/tbody/div/tr/td[2]"
	 * )).click(); Thread.sleep(10000); driver.findElement(By.xpath(
	 * "//*[@id='main-content']/div/div/div/div/section/div[2]/div/div[2]/button"
	 * )).click(); Thread.sleep(10000); driver.findElement(By.xpath(
	 * "//*[@id='root']/div/div/div[1]/div/nav/div/ul[2]/li/i")).click();
	 * Thread.sleep(10000);
	 * driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[1]")
	 * ).click(); Thread.sleep(10000); WebElement
	 * certificateimg=driver.findElement(By.xpath(
	 * "//*[@id='main-content']/div[1]/div/div/div/div[2]/div/div[1]/div/div/div[2]/div[3]/img"
	 * )); certificateimg.click();
	 */
}
