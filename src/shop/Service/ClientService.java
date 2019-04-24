package shop.Service;

public interface ClientService {
     void buyItem(String name, int count);
     void addItemToBasket(String name, int count);
     void removeItemFromBasket(String name);
}
