import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class smartCombine71{
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(2);

        list2.add(1);
        list2.add(4);
        list2.add(5);

        combiSmart(list1, list2);
        System.out.println("A CombiSmart result: "+list1);
        combiSmarter(list1, list2);
        System.out.println("A CombiSmarter result: "+list1);

    }

    public static void combiSmart(ArrayList<Integer> list1, ArrayList<Integer> list2){
        //list1.removeIf(i->(list1.indexOf(i) != list1.lastIndexOf(i)));//only in java 8 - removes all the elements of this collection that satisfy the given predicate. this is not what we want but interesting
        for(int i : list1){
            if(list2.contains(i)){
                list2.remove(Integer.valueOf(i));
            }
        }
        list1.addAll(list2);
    /**
     * Initially I wanted to add the elements of list2 to list1 and then look for duplicates
     * and remove them. This did not work as well as trying to iterate over a list then removing duplicates
     * leads to ConcurrentModificationException.
     * The above is what the exercise wanted me to do
     * combine the two lists but if the list you are combining has the same number in 
     * the first list, remove it. Obviously in my first list i already have duplicates
     * in order to make sure the list has no duplicates look below - also
     * If you wanted no duplicates you would use Sets instead of lists*/    
    }

    public static void combiSmarter(ArrayList<Integer> list1, ArrayList<Integer> list2){
        list1.addAll(list2);
        HashSet<Integer> hs = new HashSet<>();
        hs.addAll(list1);
        list1.clear();
        list1.addAll(hs);
    }
    /**
     * Here we use a type of Collection called a Set, more specifically a Hashset
     * this implements Set. Sets dont allow duplicates, a hashset will not gurantee 
     * the order of the list anymore.
     */
}