package edu.bu.met.cs665.example1;
public class DeliveryRequest {
    private Shop shop;

    public DeliveryRequest(Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }
}