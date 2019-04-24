package shop.Service;

import shop.entity.Item;

public interface ServiceShop {

     boolean addNewItem(Item item);
     Item removeItemByName(String name);

}
