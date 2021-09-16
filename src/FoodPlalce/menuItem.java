package FoodPlace;

public class MenuItem {
    private double price;
    private String description;
    private String dishName;
    private int calories;
    private String category;
    private boolean isNewItem;
    private boolean isSpecial;



    public MenuItem(double price, String description, String dishName, int calories, String category, boolean isNewItem, boolean isSpecial) {
        this.price = price;
        this.description = description;
        this.dishName = dishName;
        this.calories = calories;
        this.category = category;
        this.isNewItem = isNewItem;
        this.isSpecial = isSpecial;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNewItem() {
        return isNewItem;
    }

    public void setNewItem(boolean newItem) {
        isNewItem = newItem;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    public void setSpecial(boolean special) {
        isSpecial = special;
    }

    public static void addMenuItem(MenuItem menuItem) {


    }

    public static void removeMenuItem() {


    }
}