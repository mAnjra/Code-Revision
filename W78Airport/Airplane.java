package Airport;
import java.util.HashMap;
/**
 * Creates a new a airplane - with id and seat number
 * and adds it to a hashmap
 */
public class Airplane {

    private HashMap<String, String> airplanes;

    public Airplane() {
        this.airplanes = new HashMap<>();
    }

    public void addPlane(String id, String seat){
        this.airplanes.put(id,seat);
    }

    public String getPlane(String id){
        return this.airplanes.get(id);
    }

    public void printAllPlanes(){
        this.airplanes.entrySet().forEach(p-> System.out.println(p.getValue()));
    }

}