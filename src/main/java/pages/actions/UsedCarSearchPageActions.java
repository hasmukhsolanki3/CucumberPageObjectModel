package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UsedCarSearchPageLocators;
import utils.SeleniumDriver;

public class UsedCarSearchPageActions {
	
	public UsedCarSearchPageLocators usedCarSearchPageLocators = null;
	
	public UsedCarSearchPageActions(){
		
		this.usedCarSearchPageLocators = new UsedCarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarSearchPageLocators);
	}

	public void selectCarMake(String carBrand) {

		Select selectCarMake = new Select(usedCarSearchPageLocators.carMakeDropDown);
		selectCarMake.selectByVisibleText(carBrand);
	}

	public void selectCarModel(String carModel) {

		Select selectCarModel = new Select(usedCarSearchPageLocators.carModelDropDown);
		selectCarModel.selectByVisibleText(carModel);

	}

	public void selectLocation(String location) {

		Select selectLocation = new Select(usedCarSearchPageLocators.locationDropDown);
		selectLocation.selectByVisibleText(location);

	}

	public void selectPrice(String price) {

		Select selectPrice = new Select(usedCarSearchPageLocators.priceDropDown);
		selectPrice.selectByVisibleText(price);

	}
	
	public void clickOnFindMyNextCarBtn(){
		
		usedCarSearchPageLocators.findMyNextCarBtn.click();
		
	}
	
}
