package demoPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demoIntializer.Browser;


public class SignIn extends Browser{
	
	Menus homepage;
	public int rowcount1,rowcount2;
	//Login
		@FindBy(xpath="//input[@name='username']")
		public static WebElement username;
		
		@FindBy(xpath="//input[@name='password']")
		public static WebElement password;
		
		@FindBy(xpath="//button[@type='submit']")
		public static WebElement login;
		
		@FindBy(xpath="//a[text()='Forgot Password']")
		public static WebElement forgotpwd;
		
		@FindBy(xpath="//a[text()='Register with invite code']")
		public static WebElement Invitecode;
		
		@FindBy(xpath="//h2[text()='Sign In']")
		public static WebElement signin;
		
		@FindBy(xpath="//li[@class='nav-item dropdown h-profile']/a/img")
		public static WebElement profileimg;
		
		@FindBy(xpath="//div[@class='log-out']")
		public static WebElement logout;
		
		@FindBy(xpath="//*[@id='root']/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/span")
		public static WebElement urequired;
		
		@FindBy(xpath="//*[@id='root']/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/span")
		public static WebElement prequired;
		
		@FindBy(xpath="//label[text()='Please enter your registered email id']")
		public static WebElement regemailid;
		
		@FindBy(xpath="//*[@id='root']/div/div/div/div[2]/form/div[1]/span")
		public static WebElement frequired;
		
		@FindBy(xpath="//*[@id='main']/div[3]/div/div/div/div[1]/p")
		public static WebElement needvalidemail;
		
		@FindBy(xpath="//*[@id='root']/div/div/div/div[2]/form/div[2]/button")
		public static WebElement fsubmit;
		
		@FindBy(xpath="//*[@id='main']/div[3]/div/div/div/div[1]/p")
		public static WebElement femailsuccess;

		@FindBy(xpath="//p[text()='Back to Login']")
		public static WebElement fbacktologin;

	public SignIn(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void adminlogin(){
		username.sendKeys(wb.getSheet("Utility").getRow(2).getCell(0).getStringCellValue());
		password.sendKeys(wb.getSheet("Utility").getRow(2).getCell(1).getStringCellValue());
		login.click();
	}
	public String femailsuccess(){
		return femailsuccess.getText();
	}
	public String frequired(){
		return frequired.getText();
	}
	public void fsubmit(){
		fsubmit.click();
	}
	
	public String emailnotfound(){
		return needvalidemail.getText();
	}
	public void forgotpwd(){
		forgotpwd.click();
	}
    public String validateLoginPageTitle(){
	    return driver.getTitle();
    }
    
    public String validatesignin(){
	    return signin.getText();
    }
    
    public String validateusername(){
	    return urequired.getText();
    }
    
    public String validatepassword(){
	    return prequired.getText();
    }

    
    public Menus login() throws InterruptedException{
    	//username.sendKeys(wb.getSheet("LoginData").getRow(i).getCell(0).getStringCellValue());
    
    	//password.sendKeys(wb.getSheet("LoginData").getRow(i).getCell(1).getStringCellValue());
    	login.click();
    	Thread.sleep(1000);
    	return new Menus();
    }
}
