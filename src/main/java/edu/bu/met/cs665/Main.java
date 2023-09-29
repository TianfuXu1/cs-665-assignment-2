/**
 * Name: Tianfu Xu
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/29/2023
 * File Name: Main.java
 * Description: The Main class serves as the entry point for executing the program. In this class, a shop named "Amazon Store" is created, and five drivers with distinct names ("John Doe", "Jane Doe", "Bob Smith", "Alice Johnson", and "Eve Davis") are instantiated. Each driver is then registered as an observer of the shop, allowing them to receive delivery requests. Finally, a delivery request is generated, initiating the notification process to all registered drivers. This class orchestrates the interaction between the shop and its observers, demonstrating the functionality of the observer pattern in action.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Driver;
import edu.bu.met.cs665.example1.Shop;

public class Main {
  public static void main(String[] args) {

    Shop shop = new Shop("Amazon Store");

      Driver driver1 = new Driver("John Doe");
      Driver driver2 = new Driver("Jane Doe");
      Driver driver3 = new Driver("Bob Smith");
      Driver driver4 = new Driver("Alice Johnson");
      Driver driver5 = new Driver("Eve Davis");

      shop.addObserver(driver1);
      shop.addObserver(driver2);
      shop.addObserver(driver3);
      shop.addObserver(driver4);
      shop.addObserver(driver5);

      shop.generateDeliveryRequest();
  }
}