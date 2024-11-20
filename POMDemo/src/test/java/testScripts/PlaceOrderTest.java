package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage;
import pages.CheckOutPage;
import pages.LoginPage;
import pages.ProductListPage;

public class PlaceOrderTest{
	WebDriver driver;
	LoginPage loginPage;
	ProductListPage listPage;
	CartPage cartPage;
	CheckOutPage checkOutPage;
	
	public PlaceOrderTest() {
		TestBase.initDriver();//initi driver
		driver=TestBase.getDriver();//get driver
		loginPage=new LoginPage(driver);// passing driver to each page object
		listPage=new ProductListPage(driver);
		cartPage=new CartPage(driver);
		checkOutPage=new CheckOutPage(driver);
				
	}
	
	@BeforeTest
	public void setUp() {
		TestBase.openUrl("https://sauceDemo.com");
		loginPage.validLogin("standard_user", "secret_sauce");
		
	}
	
	
	//@Test
	public void login() {
		loginPage.validLogin("standard_user", "secret_sauce");
		TestBase.tearDown();
		
	}
	
	@Test
	public  void addItemTest() {
		
		//Assert.assertTrue(listPage.isOnproducts());
		listPage.addTocart();
		listPage.viewCart();
		
	}
	
	@Test
	public void checkOut() {
		cartPage.isItemAdded();
		cartPage.proceedCheckout();
		
	}
	@Test
	public void isCheckOutDetailsEntered() {
		Assert.assertTrue(checkOutPage.enterCheckOutDetails("hari", "uma", "123"));
	}

	
	
	

}
