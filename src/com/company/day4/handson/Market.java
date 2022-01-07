package com.company.day4.handson;

public class Market implements Item {
    @Override
    public ItemModel item(ItemModel itemModel) {
        System.out.println("Returns item information from the database.");
        return null;
    }

    @Override
    public ItemModel updateModel(ItemModel itemModel) {
        System.out.println("Updates item information in the database.");
        return null;
    }

    @Override
    public ItemModel saveModel(ItemModel saveModel) {
        System.out.println("Saves item information in the database.");
        return null;
    }

    @Override
    public void deleteModel() {
        System.out.println("Deletes item information in the database.");
    }
}
