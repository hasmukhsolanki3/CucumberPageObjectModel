package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	
	CarsGuideHomePageLocators carsGuideHomePageLocators = null;

	public CarsGuideHomePageActions(){
		
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
		
	}
	
	public void moveToBuyPlusSaleMenu(){
		
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buyPlusSellLink).perform();

	}
	
	public void moveToReviewsMenu(){

		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.reviewsLink).perform();;
		
	}
	
	public void clickOnSearchCars(){
		
		carsGuideHomePageLocators.searchCarsLink.click();
		
	}
	
	public void clickOnUsed(){
		
		carsGuideHomePageLocators.usedLink.click();
		
	}
	
}
