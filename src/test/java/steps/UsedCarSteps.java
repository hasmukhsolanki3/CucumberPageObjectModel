package steps;

import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarSearchPageActions;

public class UsedCarSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	UsedCarSearchPageActions usedCarSearchPageActions = new UsedCarSearchPageActions();
	
	@And("^click on \"([^\"]*)\" link on Used Car Page$")
	public void click_on_link_on_Used_Car_Page(String arg1) throws Throwable {
	    
	    carsGuideHomePageActions.clickOnUsed();
	}

	@And("^select carBrand as \"([^\"]*)\" from AnyMake dropdown on Used Car Page$")
	public void select_carBrand_as_from_AnyMake_dropdown_on_Used_Car_Page(String carBrand) throws Throwable {

		usedCarSearchPageActions.selectCarMake(carBrand);
	}

	@And("^select car Model on Used Car Page$")
	public void select_car_Model_on_Used_Car_Page(List<String> list) throws Throwable {

		String menu = list.get(1);
		usedCarSearchPageActions.selectCarModel(menu);
	}

	@And("^select location as \"([^\"]*)\" from SelectLocation dropdown on Used Car Page$")
	public void select_location_as_from_SelectLocation_dropdown_on_Used_Car_Page(String location) throws Throwable {

		usedCarSearchPageActions.selectLocation(location);
	}

	@And("^select price as \"([^\"]*)\" from Price dropdown on Used Car Page$")
	public void select_price_as_from_Price_dropdown_on_Used_Car_Page(String price) throws Throwable {

		usedCarSearchPageActions.selectPrice(price);
	}

	@And("^I click on Find_My_Next_Car button on Used Car Page$")
	public void i_click_on_Find_My_Next_Car_button_on_Used_Car_Page() throws Throwable {

		usedCarSearchPageActions.clickOnFindMyNextCarBtn();
	}

	@Then("^I should see list of searched cars on Used Car Page$")
	public void i_should_see_list_of_searched_cars_on_Used_Car_Page() throws Throwable {

		System.out.println("Used car list displayed");
	}


}
