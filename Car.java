package test;
// Child class extending the Vehicle class
class Car extends Main {
    double price;

    public Car(String brand, int year, double price) {
        super(brand, year); // Call the constructor of the parent class
        this.price = price;
    }

    public void displayCarInfo() {
        displayInfo(); // Call the displayInfo method from the parent class
        System.out.println("Price: $" + price);
    }
}