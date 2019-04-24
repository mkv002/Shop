package shop.entity;

import java.util.Arrays;

public class Shop {
   private Address address;
   private String nameOfShop;
   private double countOfMoney;
   private int countOfTheItems;
   private int size=0;

   private Item []items;



    public Shop(Address address, String nameOfShop, double countOfMoney,int countOfTheItems){
        this.address=address;
        this.nameOfShop=nameOfShop;
        this.countOfMoney=countOfMoney;
        this.countOfTheItems=countOfTheItems;
        items=new Item[countOfTheItems];
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getNameOfShop() {
        return nameOfShop;
    }

    public void setNameOfShop(String nameOfShop) {
        this.nameOfShop = nameOfShop;
    }

    public double getCountOfMoney() {
        return countOfMoney;
    }

    public void setCountOfMoney(double countOfMoney) {
        this.countOfMoney = countOfMoney;
    }

    public int getCountOfTheItems() {
        return countOfTheItems;
    }

    public void setCountOfTheItems(int countOfTheItems) {
        this.countOfTheItems = countOfTheItems;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }


    @Override
    public String toString() {
        return "Shop{" +
                "address=" + address.toString() +
                ", nameOfShop='" + nameOfShop + '\'' +
                ", countOfMoney=" + countOfMoney +
                ", countOfTheItems=" + countOfTheItems +
                ", size=" + size +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
