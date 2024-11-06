import java.util.ArrayList;

public class Car {

    private ArrayList<Passenger> manifestPassengers;
    private int maxPassengers;

    public Car(int max){
        this.maxPassengers = max;
        this.manifestPassengers = new ArrayList<>();
    }

    /* method to get the max number of passengers */

    public int getMaxPass(){
        return this.maxPassengers;
    }

    /* method to get the passenger manifest */

    public void getManifest(){
        if (manifestPassengers.isEmpty()){
            System.out.println("There are no passengers in this car");
        }
        else{
            System.out.println("Passenger Manifest: " + this.manifestPassengers);
        }
    }

    /* method to find out how many seats are left */

    public int seatsLeft(){
        int size = manifestPassengers.size();
        int seatsLeft = this.maxPassengers - size;
        return seatsLeft;
    }

    /* method to add passenger */

    public boolean addPassenger(Passenger name){
        if (seatsLeft() > 0){
            manifestPassengers.add(name);
            System.out.println(name + "is now on board");
            return true;
        }
        else{
            System.out.println("This car does not have space for another passenger");
            return false;
        }
    }

    /* method to remove passenger */

    public boolean removePassenger(Passenger name){
        if(manifestPassengers.contains(name)){
            manifestPassengers.remove(name);
            return true;
        }
        else{
            System.out.println("That person is not in this car");
            return false;
        }
    }
}