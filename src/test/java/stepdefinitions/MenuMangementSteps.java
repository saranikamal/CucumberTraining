package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linkedinlearning.cucumbercourse.RestaurantMenu;
import linkedinlearning.cucumbercourse.RestaurantMenuItem;

public class MenuMangementSteps {

    RestaurantMenuItem newMenuItem;
    RestaurantMenu locationMenu = new RestaurantMenu();
    @Given("I have a menu item with name {string} and price {int}")
    public void i_have_a_menu_item_with_name_and_price(String newItemName, int price) {
        newMenuItem = new RestaurantMenuItem(price,newItemName, newItemName);
        System.out.println("Step 1 ");
    }

    @When("I add that menu item")
    public void i_add_that_menu_item() {
        locationMenu.addMenuItem(newMenuItem);
        System.out.println("Step 2 ");
    }

    @Then("Menu item with name {string} should be added")
    public void menu_item_with_name_should_be_added(String name) {
        boolean exists = locationMenu.doesItemExist(newMenuItem);
        System.out.println("Step 3 " + exists);
    }
}
