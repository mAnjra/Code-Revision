package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private int maxCapacity;
    private List<Thing> box = new ArrayList<>();

    public Box(int maxCapacity){
        this.maxCapacity = maxCapacity;
    }

    public boolean addThing(Thing thing){

    }


    @Override
    public int getVolume() {
        return 0;
    }
}
