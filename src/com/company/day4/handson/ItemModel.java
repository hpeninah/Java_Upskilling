package com.company.day4.handson;

public class ItemModel {
    private long id;
    private String itemName;
    private long itemStock;
    private double itemPrice;

    public ItemModel(long id, String itemName, long itemStock, double itemPrice) {
        this.id = id;
        this.itemName = itemName;
        this.itemStock = itemStock;
        this.itemPrice = itemPrice;
    }

    public ItemModel(){

    }

    public long getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public long getItemStock(){
        return itemStock;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemStock(long itemStock) {
        this.itemStock = itemStock;
    }

    public void setItemPrice(double itemPrice){
        this.itemPrice = itemPrice;
    }
}
