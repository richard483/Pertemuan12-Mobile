package com.example.pertemuan12;

public class Food {
    private String name;
    private String foodInformation;
    private String price;
    private Integer foodThumbnail;

    public Food(String name, String foodInformation, String price, Integer foodThumbnail) {
        this.name = name;
        this.foodInformation = foodInformation;
        this.price = price;
        this.foodThumbnail = foodThumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodInformation() {
        return foodInformation;
    }

    public void setFoodInformation(String foodInformation) {
        this.foodInformation = foodInformation;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getFoodThumbnail() {
        return foodThumbnail;
    }

    public void setFoodThumbnail(Integer foodThumbnail) {
        this.foodThumbnail = foodThumbnail;
    }
}
