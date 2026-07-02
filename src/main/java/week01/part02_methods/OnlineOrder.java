// src/main/java/week01/part02_methods/OnlineOrder.java
package week01.part02_methods;

public class OnlineOrder {

    public static void main(String[] args) {
        processOrder();
    }

    // TODO: main must call this method.
    // This method must call the other methods in this exact order:
    //   1) addItems()
    //   2) checkout()
    //   3) confirmOrder()
    //
    // It must print exactly:
    // Processing order...
    // Adding items to cart.
    // Checking out.
    // Order confirmed.
    public static void processOrder() {
        System.out.println("Processing order...");
        addItems();
        checkout();
        confirmOrder();
    }

    // TODO: Print exactly: Adding items to cart.
    public static void addItems() {
        System.out.println("Adding items to cart");
    }

    // TODO: Print exactly: Checking out.
    public static void checkout() {
        System.out.println("Checking out");
    }

    // TODO: Print exactly: Order confirmed.
    public static void confirmOrder() {
        System.out.println("Order confirmed");
    }
}
