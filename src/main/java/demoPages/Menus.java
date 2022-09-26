package demoPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demoIntializer.Browser;


public class Menus extends Browser{

	SignIn signin;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	public static WebElement dashboard;
	
	@FindBy(xpath="//span[text()='Settings']")
	public static WebElement settings;
	
	@FindBy(xpath="//h4[text()='User Management']")
	public static WebElement usermanagement;
	
	@FindBy(xpath="//span[text()='Users']")
	public static WebElement users;
	
	@FindBy(xpath="//span[text()='Groups']")
	public static WebElement groups;
	
	@FindBy(xpath="//h4[text()='Training Assignment']")
	public static WebElement trainingass;
	
	@FindBy(xpath="//*[@id='c5']/a/span")
	public static WebElement assignment;
	
	@FindBy(xpath="//*[@id='sidenav']/div/div/div[5]/div[1]/span/h4")
	public static WebElement instructorled;
	
	@FindBy(xpath="//span[text()='Record Completion']")
	public static WebElement recordcompletion;
	
	@FindBy(xpath="//*[@id='sidenav']/div/div/div[6]/div[1]/span/h4")
	public static WebElement resource;
	
	@FindBy(xpath="//span[text()='Steering Committee']")	
	public static WebElement steeringcommittee;
	
	@FindBy(xpath="//h4[text()='Training']")
	public static WebElement training;
	
	@FindBy(xpath="//span[text()='Courses']")
	public static WebElement courses;
	
	@FindBy(xpath="//span[text()='Story Feeds']")
	public static WebElement storyfeeds;
	
	@FindBy(xpath="//*[@id='sidenav']/div/div/div[9]/div/a/span")
	public static WebElement rateyourstate;
	
	@FindBy(xpath="//span[text()='Near Miss Register']")
	public static WebElement nearmissregister;
	
	@FindBy(xpath="//h4[text()='Reports']")
	public static WebElement reports;
	
	@FindBy(xpath="//span[text()='Learner Progress']")
	public static WebElement Learnerprogress;
	
	@FindBy(xpath="//span[text()='Learner Course Progress']")
	public static WebElement learnercourseprogress;
	
	@FindBy(xpath="//span[text()='Near Miss']")
	public static WebElement nearmiss;
	
	@FindBy(xpath="//a[@class='active']/span")
	public static WebElement Reportsrateyourstate;
	
	@FindBy(xpath="//*[@id='sidenav']/div/div/div[12]/div/a/span")
	public static WebElement templates;
	
	@FindBy(xpath="//*[@id='sidenav']/div/div/div[13]/div/a/span")
	public static WebElement riskpattern;

	@FindBy(xpath="//*[@id='sidenav']/div/div/div[14]/div/a/span")
	public static WebElement rcd;
	
	@FindBy(xpath="//li[@class='nav-item dropdown h-profile']/a/img")
	public static WebElement profileimg;
	
	@FindBy(xpath="//div[@class='log-out']")
	public static WebElement logout;

	@FindBy(xpath="//span[@id='addchoose']")
	public static WebElement chooseimg;
	
	
	
	public Menus() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
    public String getdashboard(){
	    return dashboard.getText();
    }
    
    public void profileimg(){
       profileimg.click();
    	
    }
    public Menus logout(){
    	logout.click();
    	return new Menus();
    }
    public Menus usermgm(){
    	usermanagement.click();
    	return new Menus();
    }
    
}
