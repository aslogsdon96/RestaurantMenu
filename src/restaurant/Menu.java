package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuList;
    private Date lastUpdate;

    public void addMenuItem(double price, String description, String category, Date dateAdded) {
        MenuItem newMenuItem = new MenuItem(price, description, category, dateAdded);
    }

    public void removeMenuItem(int index) {
        menuList.remove(index);
    }

    public void setLastUpdatedDate() {
        this.lastUpdate = new Date();
    }

    public void printAll() {
        System.out.println(menuList);
    }
}
