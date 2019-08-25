package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;

public class CarsSearchPageActions {

	CarSearchPageLocators carSearchPageLocators = null;

	public CarsSearchPageActions() {

		this.carSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);

	}

	public void selectCarMake(String carBrand) {

		Select selectCarMake = new Select(carSearchPageLocators.carMakeDropDown);
		selectCarMake.selectByVisibleText(carBrand);
	}

	public void selectCarModel(String carModel) {

		Select selectCarModel = new Select(carSearchPageLocators.carModelDropDown);
		selectCarModel.selectByVisibleText(carModel);

	}

	public void selectLocation(String location) {

		Select selectLocation = new Select(carSearchPageLocators.locationDropDown);
		selectLocation.selectByVisibleText(location);

	}

	public void selectPrice(String price) {

		Select selectPrice = new Select(carSearchPageLocators.priceDropDown);
		selectPrice.selectByVisibleText(price);

	}
	
	public void clickOnFindMyNextCarBtn(){
		
		carSearchPageLocators.findMyNextCarBtn.click();
		
	}
}
