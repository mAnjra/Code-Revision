import java.util.ArrayList;


public class ArrayListImplemen{
    public static void main(String[] args){
        
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Matt");
        arrayList.add("Ratt");
        arrayList.add("Shatt");

        System.out.println("The size of this list is: " + arrayList.size());
            System.out.println("The First name is: " + arrayList.get(0));
            System.out.println("The Third name is: " + arrayList.get(2));
        System.out.println("The names on the list are: "+arrayList.toString());

        arrayList.remove("Ratt");

        System.out.println("The names on the list now are: "+arrayList.toString());

        if(arrayList.contains("Ratt")){
            System.out.println("Ratt is on the list!");
        }else{
            System.out.println("Ratt is not on the list");
        }
    }
}
