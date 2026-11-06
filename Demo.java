import java.util.LinkedList;
class Vehicle {

    protected String vehicleNumber;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void park() {
        System.out.println("VehicleParking " + vehicleNumber);
    }

    @Override
    public String toString() {
        return vehicleNumber;
    }
}

class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public void park() {
        System.out.println("CarParking " + vehicleNumber);
    }
}

class Bus extends Vehicle {

    public Bus(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public void park() {
        System.out.println("BusParking " + vehicleNumber);
    }
}

class Van extends Vehicle {

    public Van(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public void park() {
        System.out.println("VanParking " + vehicleNumber);
    }
}
class VehicleQueue {

    private LinkedList<Vehicle> queue = new LinkedList<>();

    public void enQueue(Vehicle vehicle) {
        queue.addLast(vehicle);
    }

    public void callPark() {

        if (!queue.isEmpty()) {

            Vehicle vehicle = queue.removeFirst();

            vehicle.park();
        }
    }

    public void printVehicleQueue() {
        System.out.println(queue);
    }
}

public class Demo {

    public static void main(String[] args) {

        VehicleQueue queue = new VehicleQueue();

        queue.enQueue(new Car("C001"));
        queue.enQueue(new Bus("B001"));
        queue.enQueue(new Bus("B002"));
        queue.enQueue(new Car("C002"));
        queue.enQueue(new Car("C003"));
        queue.enQueue(new Van("V001"));
        queue.enQueue(new Van("V002"));
        queue.enQueue(new Bus("B003"));

        queue.printVehicleQueue();

        queue.callPark();
        queue.callPark();
        queue.callPark();
        queue.callPark();
        queue.callPark();
        queue.callPark();
        queue.callPark();
        queue.printVehicleQueue();
    }
}
