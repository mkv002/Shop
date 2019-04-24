package shop.entity;

public class Item {
    private double price;
    private String nameOfTheItem;
    private int countOfItems;

    public Item( double price, String nameOfTheItem, int countOfItems){
        this.price=price;
        this.nameOfTheItem=nameOfTheItem;
        this.countOfItems=countOfItems;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNameOfTheItem() {
        return nameOfTheItem;
    }

    public void setNameOfTheItem(String nameOfTheItem) {
        this.nameOfTheItem = nameOfTheItem;
    }

    public int getCountOfItems() {
        return countOfItems;
    }

    public void setCountOfItems(int countOfItems) {
        this.countOfItems = countOfItems;
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", nameOfTheItem='" + nameOfTheItem + '\'' +
                ", countOfItems=" + countOfItems +
                '}';
    }
}
