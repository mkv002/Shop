package shop.Service;

import shop.entity.Client;
import shop.entity.Item;
import shop.entity.Shop;

public class ClientServiceImpl implements ClientService{

    private Shop shop;
    private Client client;

    public ClientServiceImpl(Shop shop, Client client){
        this.shop=shop;
        this.client=client;
    }

    @Override
    public void buyItem(String name, int count) {
        Item searchItem = null;
        Item[] items = shop.getItems();
        int size = shop.getSize();

        for (int i = 0; i < size; i++) {
            if (items[i].getNameOfTheItem().equals(name)) {
                searchItem = items[i];
                break;
            }
        }
        if (searchItem == null) {
            System.out.println("we dont have such item! EXCEPTION");
        } else {
            double coast = count * searchItem.getPrice();
            if (client.getCountOfmoney()>=coast){
                client.setCountOfmoney(client.getCountOfmoney()-coast);
                shop.setCountOfMoney(shop.getCountOfMoney()+coast);
             //изменить количество товаров
                searchItem.setCountOfItems(searchItem.getCountOfItems()-count);
            }
        }
    }

    @Override
    public void addItemToBasket(String name, int count) {

    }

    @Override
    public void removeItemFromBasket(String name) {

    }
}
