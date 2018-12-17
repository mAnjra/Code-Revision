import java.util.ArrayList;

public class stringLength65{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = length(list);

        System.out.println(lengths);
        
    }

    public static ArrayList<Integer> length(ArrayList<String> tist){
       ArrayList<Integer> stringLengths = new ArrayList<>();
       int count = 0;
       for(String f : tist){ //here 'string f' iterates over 'tist' - AFTER EACH INDEX the loop executes the code below.  *
           stringLengths.add(f.length());                           
           count++;
           System.out.println(f);//when compiled, the words are printed but there is a new line created AFTER EACH INDEX, which tells you                                  
       }                         //the for loop executes whatevers in its curly braces, after each index, it sees a list and does things to its indexes.                                                
                                                                    
       System.out.println(count);
       return stringLengths;
    }
}
//*
//It does not see it as a whole list and counts the elements in one go
//that is why f.length works, after f iterates over index one in 'tist'
//it executes the code below, f.length is a string method, it returns 5
//the first index has a string worth length 5. the for loop sees the list and 
//its indexes not, in this case a collection of words, it handles them individually.