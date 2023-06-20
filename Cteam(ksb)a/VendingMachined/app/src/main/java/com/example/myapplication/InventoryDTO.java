package com.example.myapplication;

public class InventoryDTO {
    private String[] item;

    public InventoryDTO(String[] item) {
        this.item = item;
    }

    public String[] getItem() {
        return item;
    }

    public void setItem(String[] item) {
        this.item = item;
    }
}
