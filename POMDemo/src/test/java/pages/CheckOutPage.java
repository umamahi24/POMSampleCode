package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	@FindBy(id="first-name")
	WebElement firstName;
	
	@FindBy(id="last-name")
	WebElement lastName;

	@FindBy(id="postal-code")
	WebElement zipCode;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continueBtn;
	
	@FindBy(xpath="//span[contains(text(),'Checkout: Overview')]")
	WebElement checkOutPageDisplayed;
	
	
	
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean enterCheckOutDetails(String firstNm, String lastNm, String code) {
		firstName.sendKeys(firstNm);
		lastName.sendKeys(lastNm);
		zipCode.sendKeys(code);
		
		continueBtn.click();
		return checkOutPageDisplayed.isDisplayed();
		
	}

}
