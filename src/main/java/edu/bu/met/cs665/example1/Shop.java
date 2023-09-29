package edu.bu.met.cs665.example1;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private List<Driver> drivers = new ArrayList<>();

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addObserver(Driver driver) {
        drivers.add(driver);
    }

    public void removeObserver(Driver driver) {
        drivers.remove(driver);
    }

    public void generateDeliveryRequest() {
        DeliveryRequest request = new DeliveryRequest(this);
        notifyDrivers(request);
    }

    private void notifyDrivers(DeliveryRequest request) {
        for (Driver driver : drivers) {
            driver.receiveDeliveryRequest(request);
        }
    }
}
