package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utils.SeleniumDriver;

public class SearchCarSteps {

	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();
	
	@Given("^I am on homepage \"([^\"]*)\" of CarsGuide site$")
	public void i_am_on_homepage_of_CarsGuide_site(String URL) throws Throwable {
	    
		SeleniumDriver.openPage(URL);
	}

	@When("^I move to the Menu$")
	public void i_move_to_the_Menu(List<String> list) throws Throwable {
	    
		String menu = list.get(1);
		System.out.println("Menu selected is: "+ menu);
		carsGuideHomePageActions.moveToBuyPlusSaleMenu();

	}

	@And("^click on \"([^\"]*)\"$")
	public void click_on(String searchCars) throws Throwable {

		carsGuideHomePageActions.clickOnSearchCars();
		
	}

	@And("^select carBrand as \"([^\"]*)\" from AnyMake dropdown$")
	public void select_carBrand_as_from_AnyMake_dropdown(String carBrand) throws Throwable {

		carsSearchPageActions.selectCarMake(carBrand);
	}

	@And("^select carModel as \"([^\"]*)\" from SelectModel dropdown$")
	public void select_carModel_as_from_SelectModel_dropdown(String carModel) throws Throwable {

		carsSearchPageActions.selectCarModel(carModel);
	}

	@And("^select location as \"([^\"]*)\" from SelectLocation dropdown$")
	public void select_location_as_from_SelectLocation_dropdown(String location) throws Throwable {

		carsSearchPageActions.selectLocation(location);
	}

	@And("^select price as \"([^\"]*)\" from Price dropdown$")
	public void select_price_as_from_Price_dropdown(String price) throws Throwable {

		carsSearchPageActions.selectPrice(price);
	}

	@And("^I click on Find_My_Next_Car button$")
	public void i_click_on_Find_My_Next_Car_button() throws Throwable {

		carsSearchPageActions.clickOnFindMyNextCarBtn();
	}

	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars() throws Throwable {
	    
		System.out.println("Car list displayed");
	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expected) throws Throwable {
	    
		String actual = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actual, expected);
	}
	
}
