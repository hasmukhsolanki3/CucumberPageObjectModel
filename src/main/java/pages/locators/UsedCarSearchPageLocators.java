package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarSearchPageLocators {

	@FindBy(how=How.XPATH, using="//*[@id='makes']")
	public WebElement carMakeDropDown;
	
	@FindBy(how=How.XPATH, using="//*[@id='models']")
	public WebElement carModelDropDown;

	@FindBy(how=How.XPATH, using="//*[@id='locations']")
	public WebElement locationDropDown;

	@FindBy(how=How.XPATH, using="//*[@id='price-max']")
	public WebElement priceDropDown;

	@FindBy(how=How.XPATH, using="//*[@id='search-submit']")
	public WebElement findMyNextCarBtn;
	
}