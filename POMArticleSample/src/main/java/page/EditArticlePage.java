package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditArticlePage {

	ArticlePage articlePage;

	@FindBy(xpath="//div[@class='article-page']//h1")
	WebElement articleHeader;
	
	@FindBy(xpath="//a[contains(text(),'Edit Article')]")
   WebElement editArticelBtn;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement updateBtn;
	
	@FindBy(xpath="//a[@class='author']")
	WebElement articelPageView;
	

	@FindBy(xpath="//input[@name='tags']")
	WebElement tags;
	
	public EditArticlePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	public void editArticleTest(String locator,String text) {
		articleHeader.isDisplayed();
		editArticelBtn.click();
//		if(locator.equalsIgnoreCase("body")) {
//			articlePage.body.clear();
//			articlePage.body.sendKeys(text);
//			
//		}
//		else if(locator.equalsIgnoreCase("description")) {
//			articlePage.description.clear();
//			articlePage.description.sendKeys(text);
//			
//		}
//		else if(locator.equalsIgnoreCase("tags")) {
//			articlePage.tags.clear();
//			articlePage.tags.sendKeys(text);
//	
//		}
//		else {
//			this.articlePage.title.clear();
//			this.articlePage.title.sendKeys(text);
//	
//		}
//		
		tags.clear();
		tags.sendKeys("updated text");
		
		updateBtn.click();
		

		
	}
}
