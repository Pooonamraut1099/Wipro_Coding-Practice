package Day4.Practice_Quiz;

public class Inheritance {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.noOfWheels();

        Scooter s = new Scooter();
        s.noOfWheels();

        Car c = new Car();
        c.noOfWheels();
    }
}

class Vehicle {
    public void noOfWheels() {
        System.out.println("No of wheels undefined");
    }
}

class Scooter extends Vehicle {
    public void noOfWheels() {
        System.out.println("No of wheels 2");
    }
}

class Car extends Vehicle {
    public void noOfWheels() {
        System.out.println("No of wheels 4");
    }
}
