package BoxesAndThings;

import java.util.ArrayList;

public class Box implements ToBeStored{
    private double weight;
    private ArrayList<ToBeStored> boxStorage = new ArrayList<>();
    private double tempWeightVar = 0;
    private int itemsNotAdded;

    public Box(double weight){

        this.weight = weight;}

    public void add(ToBeStored obj){ // any class that implements ToBeStored can be passed into this method parameter
        tempWeightVar = obj.weight() + weight(); // checking to see if there will be space after adding object to box
        if(tempWeightVar<=weight){
            this.boxStorage.add(obj);
        } else {
            itemsNotAdded++;
            System.out.println("Number of items not added: "+itemsNotAdded);
        }

    }

    public double weight(){
        double weight = 0;
        for(ToBeStored t : this.boxStorage){
            weight += t.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: "+ boxStorage.size()+" things,"+ " total weight: "+ weight()+" kg";
    }
}
