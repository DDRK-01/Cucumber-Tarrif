package com.stepdefinitions;




import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Addcus {
	static WebDriver driver;
	@Given("launch the browser")
	public void launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh S.A\\ecli\\Addcus\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	    
	}

	@Given("click the wanted button")
	public void click_the_wanted_button() {
		driver.findElement(By.xpath("(//a[text()='Add Tariff Plan'])[1]")).click();  

	}

	//@When("I complete fill the details now in twoD")
	//public void i_complete_fill_the_details_now_in_twoD(DataTable dataInfo) {
		//List<Map<String, String>> content = dataInfo.asMaps(String.class, String.class);
			//driver.findElement(By.id("rental1")).sendKeys(content.get(2).get("Rent"));
			//driver.findElement(By.id("local_minutes")).sendKeys(content.get(3).get("Local"));
			//driver.findElement(By.id("inter_minutes")).sendKeys(content.get(1).get("National"));
			//driver.findElement(By.id("sms_pack")).sendKeys(content.get(3).get("SMS"));
			//driver.findElement(By.id("minutes_charges")).sendKeys(content.get(2).get("Charge"));
			//driver.findElement(By.id("inter_charges")).sendKeys(content.get(1).get("Inter"));
			//driver.findElement(By.id("sms_charges")).sendKeys(content.get(0).get("Pack")); 
					
	//}
	//@When("I complete fill the details now in twoD list")
	//public void i_complete_fill_the_details_now_in_twoD_list(DataTable dataTable) {

		//List<List<String>> datas = dataTable.asLists(String.class);
		//driver.findElement(By.id("rental1")).sendKeys(datas.get(1).get(0));
	//driver.findElement(By.id("local_minutes")).sendKeys(datas.get(1).get(1));
	//driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(1).get(3));
	//driver.findElement(By.id("sms_pack")).sendKeys(datas.get(1).get(4));
	//driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(1).get(2));
	//driver.findElement(By.id("inter_charges")).sendKeys(datas.get(1).get(5));
	//driver.findElement(By.id("sms_charges")).sendKeys(datas.get(1).get(6));
	//}
	@When("I complete fill the details now in twoD lists {string},{string},{string},{string},{string},{string},{string},")
	public void i_complete_fill_the_details_now_in_twoD_lists(String Rent, String Local, String National, String SMS, String Charge, String Inter, String Pack) {
		driver.findElement(By.id("rental1")).sendKeys(Rent);
		driver.findElement(By.id("local_minutes")).sendKeys(Local);
		driver.findElement(By.id("inter_minutes")).sendKeys(National);
		driver.findElement(By.id("sms_pack")).sendKeys(SMS);
		driver.findElement(By.id("minutes_charges")).sendKeys(Charge);
		driver.findElement(By.id("inter_charges")).sendKeys(Inter);
		driver.findElement(By.id("sms_charges")).sendKeys(Pack);
		 
	}

	@When("some other action like submit")
	public void some_other_action_like_submit() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("check next page displayed or not")
	public void check_next_page_displayed_or_not() {
WebElement customerId = driver.findElement(By.xpath("((//a[text()='Home'])[1]"));
		
		Assert.assertTrue(customerId.isDisplayed());

	}



}
