package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	@FindBy(id="shopping_cart_container")
	WebElement cartIcon;
	
	@FindAll(value=@FindBy(xpath="//div[@class='cart_item']"))
	List<WebElement> items;
	
	@FindBy(id="checkout")
	WebElement chkOutBtn;
	
	
	public CartPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean isItemAdded()
	{
		if(items.size()==2) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void proceedCheckout() {
		chkOutBtn.click();
		
	}
	
	
	
}
