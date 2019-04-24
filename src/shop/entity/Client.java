package shop.entity;

public class Client {
    private int accountNumber;
    private String firstName;
    private String lastName;
    private double countOfmoney;
    private String phoneNumber;
    private static int counter;
    private int id;

    public Client(int accountNumber, String firstName,String lastName, int countOfmoney, String phoneNumber){
        this.accountNumber=accountNumber;
        this.firstName=firstName;
        this.lastName=lastName;
        this.countOfmoney=countOfmoney;
        this.phoneNumber=phoneNumber;
        id=counter;
        counter++;
    }

    @Override
    public String toString() {
        return "Client{" +
                "accountNumber=" + accountNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", countOfmoney=" + countOfmoney +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", id=" + id +
                '}';
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCountOfmoney() {
        return countOfmoney;
    }

    public void setCountOfmoney(double countOfmoney) {
        this.countOfmoney = countOfmoney;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }
}
