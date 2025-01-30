package U7T1;

import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    public void addCar(Car car){
        inventory.add(car);
    }

    public boolean swap(int a, int b){
        if(a < 0 || a >= inventory.size() || b < 0 || b >= inventory.size()){
            return false;
        }
        else{
            inventory.set(b, inventory.set(a, inventory.get(b)));
            return true;
        }
    }

    public ArrayList<Car> getInventory(){
        return inventory;
    }


}
