package shop;

import shop.Service.*;
import shop.entity.Address;
import shop.entity.Client;
import shop.entity.Item;
import shop.entity.Shop;
import shop.Service.Window;
public class Main {
    public static void main(String[] args) {
     Window w1=new Window();

        Shop shop=new Shop(new Address("SBP","eNGELSA STREET",44,4),
                "Pyaterochka",
                300000,
                2);
        System.out.println(shop.toString());
        ServiceShop serviceShop=new ServiceShopImpl(shop);

        serviceShop.addNewItem(new Item(500,"ikra krasnaya",20));

        serviceShop.addNewItem(new Item(50,"bread darnitzkii",20));

        serviceShop.addNewItem(new Item(100, "skittles", 30));


        System.out.println(shop.toString());

        serviceShop.removeItemByName("bread darnitzkii");

        System.out.println(shop.toString());

        Client client= new Client(1234, "Vasya", "Pupkin", 6000, "89313219293");

        ClientService clientService= new ClientServiceImpl(shop, client);

        clientService.buyItem("skittles", 5);

        System.out.println(client.toString());
        System.out.println('\n'+shop.toString());

    }

}
