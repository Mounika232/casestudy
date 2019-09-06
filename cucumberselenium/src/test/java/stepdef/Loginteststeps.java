package stepdef;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import junit.framework.Assert;

	public class Loginteststeps {
		WebDriver driver;
		@Given("^user open the application$")
		public void user_open_the_application() throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\saranya.a.shanmugam\\Downloads\\chromedriver_win32\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.get("http://newtours.demoaut.com");
		}

		@When("^user enters un and psd$")
		public void user_enters_un_and_psd() throws Exception {
		    driver.findElement(By.name("userName")).sendKeys("mercury");
		    driver.findElement(By.name("password")).sendKeys("mercury");

		}

		@Then("^user click ok$")
		public void user_click_ok() throws Exception {
			driver.findElement(By.name("login")).click();
		  
		}

		@Then("^Verify login success$")
		public void verify_login_success() throws Exception {
			
			String title=driver.getTitle();
			Assert.assertEquals("Find a Flight: Mercury Tours:", title);
		    
		}


	}



