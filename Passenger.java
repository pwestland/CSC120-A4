public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void boardCar(Car c){
        if (c.addPassenger(this) == true){
            System.out.println("Passenger has boarded this car");
        }
        else{
            System.out.println("Passenger cannot board this car");
        }
    }

    public void getOffCar(Car c){
        if (c.removePassenger(this) == true){
            System.out.println("Passenger has left this car");
        }
        else{
            System.out.println("Passenger cannot leave this car");
        }
    }
}
