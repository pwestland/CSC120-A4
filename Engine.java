public class Engine {

    /* variables regarding fuel */

    private FuelType fuelType;
    private double currentFuel;
    private double maxFuel;

    /* functions for fuel */

    public Engine(FuelType fuelType, double currentFuel, double maxFuel){
        this.fuelType = fuelType;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
    }
    public FuelType getFuelType(){
        return this.fuelType;
    }
    public double getCurrentFuel(){
        return this.currentFuel;
    }
    public double getMaxFuel(){
        return this.maxFuel;
    }

    /* refuels the train so that the fuel is at max level */

    public void refuel(){
        this.currentFuel = this.maxFuel;
    }

    /* function that makes the train go */

    public boolean go(){
        if (currentFuel > 0){
            this.currentFuel = this.currentFuel - 5;
            System.out.println("The train has " + this.currentFuel + "gallons of fuel remaining");
            return true;
        }
        else{
            System.out.println("The train is out of fuel, time to refuel");
            return false;
        }
    }

}