import java.util.ArrayList;

public class Train {
    private Engine engine;
    private int nCars;
    private ArrayList<Car> cars;
    private double maxFuel;
    private int maxPassengers;
    private ArrayList<Passenger> manifestPassengers;

    public Train(Fueltype fuelType, double maxFuel, int ncars, int maxPassengers){
        this.engine = new Engine(fuelType, maxFuel);
        this.cars = new ArrayList<>(nCars);
        for (int i = 0; i < nCars; i++){
            this.cars.add(new Car(maxPassengers));
        }
    }

    /* retrieves an engine */

    public Engine getEngine(){
        return this.engine;
    }

    /* retrieves a car */

    public Car getCar(int i){
        return cars.get(i);    
    }

    /* returns the max passengers for the whole train */

    public int getMaxPassengers(){
        return this.maxPassengers * nCars;
    }

    public int seatsLeft(){
        int space = 0;
        for (Car car: cars){
            space += car.seatsLeft();
        }
        return space;
    }

    public void getManifest(){
        if (manifestPassengers.isEmpty()){
            System.out.println("There are no passengers in this car");
        }
        else{
            System.out.println("Passenger Manifest: " + this.manifestPassengers);
        }
    }
}
