import java.util.ArrayList;

public class InterfaceTest {

    public static void main(String[] args) {
        boolean b4Door;
        Car car1 = new Car();
        // or...
        Motorvehicle car2 = new Car();
        // but...
        // car1 can call methods on Car and car2 can't, see below:

        b4Door = car1.is4Door(); // Works because car1 is declared as car type
        // b4Door = car2.is4Door(); Doesn't work because car2 is declared as Motorvehicle type

        // but... we can cast car2 into a Car type specifically...

        if(car2 instanceof Car) {
            Car car3 = (Car)car2;
            b4Door = car3.is4Door();
            System.out.println("Does car2 have 4 doors: " + b4Door);
        }

        Motorcycle motorcycle1 = new Motorcycle();

        ArrayList<Motorvehicle> vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(motorcycle1);

        for(Motorvehicle oVehicle: vehicles) {

            System.out.println("Start result: " + oVehicle.start());
            System.out.println("Stop result: " + oVehicle.stop());

            //Print out when there is a car
            if(oVehicle instanceof Car) {
                System.out.println("Car found!");
            }


        }



    }
}
