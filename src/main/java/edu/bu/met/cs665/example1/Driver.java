package edu.bu.met.cs665.example1;
public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public void receiveDeliveryRequest(DeliveryRequest request) {
        System.out.println(name + " received delivery request from " + request.getShop().getName());
    }
}