public class Passenger {
    
    private String name;

    /* makes sure that every passenger has a name */

    public Passenger(String name) {
        this.name = name;
    }

    /* method to identify passengers */

    public String getName(){
        return name;
    }

    /* method for passengers to board the car */

    public void boardCar(Car c){
        if (c.addPassenger(this) == true){
            System.out.println("Passenger has boarded this car");
        }
        else{
            System.out.println("Passenger cannot board this car");
        }
    }

    /* method for passengers to get off the car */

    public void getOffCar(Car c){
        if (c.removePassenger(this) == true){
            System.out.println("Passenger has left this car");
        }
        else{
            System.out.println("Passenger cannot leave this car");
        }
    }
}
