package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ArticlePage {
	
	
	
	@FindBy(xpath="//a[text()='New Article']")
	WebElement newArticleLink;
	@FindBy(xpath="//input[@name='title']")
	WebElement title;

	@FindBy(xpath="//input[@name='description']")
	WebElement description;
	
	@FindBy(xpath="//textarea[@name='body']")
	WebElement body;
	
	@FindBy(xpath="//input[@name='tags']")
	WebElement tags;
	
	@FindBy(xpath="//button[text()='Publish Article']")
	WebElement publishBtn;
	
	@FindBy(xpath="//div[@class='article-page']")
	WebElement articlePage;
			
	
	

	
	public ArticlePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean createArticle(String titleVal,String descVal, String content, String tagValue) {
		
		newArticleLink.click();
		title.sendKeys(titleVal);
		description.sendKeys(descVal);
		body.sendKeys(content);
		tags.sendKeys(tagValue);
		publishBtn.submit();
		
		return articlePage.isDisplayed();
		
	}

}
