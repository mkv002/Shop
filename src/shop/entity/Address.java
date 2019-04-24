package shop.entity;

public class Address  {
    private String nameOfTheCity;
    private String street;
    private int numberOfTheHouse;
    private int numberOfRoom;

    public Address(String nameOfTheCity, String street, int numberOfTheHouse,int numberOfRoom ){
        this. nameOfTheCity= nameOfTheCity;
        this.street=street;
        this.numberOfTheHouse=numberOfTheHouse;
        this.numberOfRoom=numberOfRoom;
    }
    public String getNameOfTheCity(){
        return nameOfTheCity;
    }
    public void setNameOfTheCity(String nameOfTheCity){
        this.nameOfTheCity=nameOfTheCity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfTheHouse() {
        return numberOfTheHouse;
    }

    public void setNumberOfTheHouse(int numberOfTheHouse) {
        this.numberOfTheHouse = numberOfTheHouse;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    @Override
    public String toString() {
        return "Address{" +
                "nameOfTheCity='" + nameOfTheCity + '\'' +
                ", street='" + street + '\'' +
                ", numberOfTheHouse=" + numberOfTheHouse +
                ", numberOfRoom=" + numberOfRoom +
                '}';
    }
}
