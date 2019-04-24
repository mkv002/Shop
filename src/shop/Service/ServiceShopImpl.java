package shop.Service;

import shop.entity.Item;
import shop.entity.Shop;

public class ServiceShopImpl implements ServiceShop {

    private Shop shop;

    public ServiceShopImpl(Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public boolean addNewItem(Item item) {

        Item[] items = shop.getItems();
        int size = shop.getSize();
        if (size < shop.getCountOfTheItems()) {
            items[size++] = item;
            shop.setSize(size);
            //        shop.setItems(items);
        }
        else{
            Item[] items2=makeArrayBoundariesBigger(items);
            items2[size++] = item;
            shop.setSize(size);
            shop.setItems(items2);
        }
            return false;

    }
    private Item[] makeArrayBoundariesBigger(Item [] items){
        Item[] items2 = new Item[shop.getCountOfTheItems()*2];
        shop.setCountOfTheItems(shop.getCountOfTheItems()*2);
        for (int i=0; i<items.length; i++){
            items2[i]=items[i];
        }
        return items2;
    }


    @Override
    public Item removeItemByName(String name) {
        Item[]items = shop.getItems();
        int size=shop.getSize();

        for (int i=0; i<size; i++){
            if (name.equals(items[i].getNameOfTheItem())) {
                items[i]=null;
                for(int j=i;j<size-1;j++)
                    items[i]=items[i+1];
                items[size-1]=null;

                shop.setSize(--size);
                break;
            }
        }
        return null;
    }
}
