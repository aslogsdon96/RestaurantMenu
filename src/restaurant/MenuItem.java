package restaurant;

import java.util.Date;

public class MenuItem {
    private Double price;
    private String description;
    private String category;
    private Date dateAdded;

    public MenuItem(Double price, String description, String category, Date dateAdded) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
    }

    public Double getPrice() { return price; }
    protected void setPrice(Double aPrice) {
        price = aPrice;
    }

    public String getDescription() { return description; }
    protected void setDescription(String aDescription) { description = aDescription; }

    public String getCategory() { return category; }
    protected void setCategory(String aCategory) { category = aCategory; }

    public Date getDateAdded() { return dateAdded; }
    protected void setDateAdded(Date aDateAdded) { dateAdded = aDateAdded; }

}
