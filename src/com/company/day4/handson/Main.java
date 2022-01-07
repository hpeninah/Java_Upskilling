package com.company.day4.handson;

public class Main {
    public static void main(String[] args){
        Item market = new Market();
        ItemModel fruit = new ItemModel();
        fruit.setId(1);
        fruit.setItemName("Banana");
        fruit.setItemStock(545);
        fruit.setItemPrice(0.89);
        market.item(fruit);
        market.saveModel(fruit);
        market.updateModel(fruit);
        market.deleteModel();
    }
}
