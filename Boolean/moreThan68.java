import java.util.ArrayList;
import java.util.Scanner;

public class moreThan68{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(1);
        list.add(1);

        int number = Integer.parseInt(scan.nextLine());
        System.out.println(duplicate(list, number));
        scan.close();
        System.out.println(moreThanOnce(list));        
    }
    //NO INPUT METHOD
    public static boolean moreThanOnce(ArrayList<Integer> fist){
        for(int i : fist){
            if(fist.indexOf(i)!=fist.lastIndexOf(i)){
                return true;
                /**
                 * INDEXOF & LASTINDEXOF - both methods go from left to write in a String object and return the index.
                 * if no index is found then -1 is returned. Only diff is last returns last index of the element you want to search
                 * and indexof returns the index of the first time it occurred.
                 * //this implies they were found at different 
                 * indexes so if the first place it was found and the last place it was 
                 * found are different(not equal) then they are two occurrences. The op has to be !=
                 * == will not work as 9 for instance is found only once, its occurrence first 
                 * and last is index 0 so the if statemnet will execute and give the wrong result.
                 */
            }
        }
       return false; 
    }
    //SEARCH METHOD
    public static boolean duplicate(ArrayList<Integer> zist, int search){
        int counter = 0;
        for(int k : zist){
            if(search==k){
                counter++;
            }
        }
        if(counter >=2){
            return true;
        }
        return false;
    }
}