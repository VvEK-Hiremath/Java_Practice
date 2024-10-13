public class class_objects {
    public static void main(String[] args) {
        // Create Car objects
        Car car1 = new Car("Toyota", "Camry", 2020, 15000);
        Car car2 = new Car("Honda", "Civic", 2021, 8000);

        // Display car details
        System.out.println("Car 1 Details:");
        car1.displayDetails();

        System.out.println("\nCar 2 Details:");
        car2.displayDetails();

        // Drive the cars
        car1.drive(100);
        car2.drive(50);
        
        // Display updated details
        System.out.println("\nUpdated Car 1 Details:");
        car1.displayDetails();

        System.out.println("\nUpdated Car 2 Details:");
        car2.displayDetails();
    }
}

// Car class
class Car {
    // Attributes
    private String make;
    private String model;
    private int year;
    private double mileage;

    // Constructor
    public Car(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage + " miles");
    }

    // Method to drive the car and increase mileage
    public void drive(double miles) {
        if (miles > 0) {
            mileage += miles;
            System.out.println("Drove " + miles + " miles. New mileage: " + mileage + " miles.");
        } else {
            System.out.println("Invalid mileage. Please enter a positive number.");
        }
    }
}
