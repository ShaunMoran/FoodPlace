ppackage FoodPlace;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastModDate;
    private ArrayList <MenuItem> MenuItem = new ArrayList<>();


    public Menu(Date lastModifiedDate, ArrayList<MenuItem> menuItem) {
        this.lastModDate = lastModifiedDate;
        MenuItem = menuItem;
    }

    public Date getLastModifiedDate() {
        return lastModDate;
    }

    public void setLastModifiedDate(Date date) {
        this.lastModDate = date;
    }

    public ArrayList<MenuItem> getMenuItem() {
        return MenuItem;
    }

    public void addMenuItem(MenuItem newMenuItem){
        this.MenuItem.add(newMenuItem);
    }
    public void removeMenueItem(MenuItem menuItem){
        this.MenuItem.remove(menuItem);}

}