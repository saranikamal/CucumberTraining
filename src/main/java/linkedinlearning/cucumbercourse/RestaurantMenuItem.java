package linkedinlearning.cucumbercourse;

public class RestaurantMenuItem {

    private int price;
    private String description;
    private String name;

    public RestaurantMenuItem(int price, String description, String name) {
        this.price = price;
        this.description = description;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }
}
