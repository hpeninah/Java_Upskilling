package com.company.day4.handson;

public interface Item {
    ItemModel item(ItemModel itemModel);
    ItemModel updateModel(ItemModel itemModel);
    ItemModel saveModel(ItemModel saveModel);
    void deleteModel();
}
