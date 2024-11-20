package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import page.ArticlePage;
import page.EditArticlePage;
import page.LoginPage;


public class CreateAndEditArticleTest {
	WebDriver driver;
	LoginPage loginPage;
	ArticlePage articlePage;
	EditArticlePage editArticlePage;
	
	
	public CreateAndEditArticleTest() {
		TestBase.initDriver();//initi driver
		driver=TestBase.getDriver();//get driver
		loginPage=new LoginPage(driver);// passing driver to each page object
		articlePage= new ArticlePage(driver);
		editArticlePage=new EditArticlePage(driver);
		
				
	}
	
	@BeforeTest
	public void setUp() {
		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/#/login");
		loginPage.validLogin("maheswari77@gmail.com", "College@123.");
		
	}
	
	@Test
	public void isArticleCreated() {
		Assert.assertTrue(articlePage.createArticle("Selenium Type4", "Selenium IDE"," Selenium IDE 4", "IDE"));
		
		
	}
	
	@Test
	public void isArticleEdited() {
		//TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/#/article/selenium-type2");
		editArticlePage.editArticleTest("title", "updated text");
		
	}

}
