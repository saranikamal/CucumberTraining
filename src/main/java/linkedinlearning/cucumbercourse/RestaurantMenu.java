package linkedinlearning.cucumbercourse;

import java.util.ArrayList;

public class RestaurantMenu {

	ArrayList<RestaurantMenuItem> MenuItems = new ArrayList<RestaurantMenuItem>();

	public boolean addMenuItem(RestaurantMenuItem newMenuItem) {
				return MenuItems.add(newMenuItem);
	}
	
	public boolean doesItemExist(RestaurantMenuItem newMenuItem) {
		boolean exists = false;
		if (MenuItems.contains(newMenuItem)) {
			exists = true;
		}
		return exists;
	}
}
