import java.util.ArrayList;

/**
 * Example of 'for-each' loop, when to use it, how.
 * commonly used to iterate over a list or collection
 * read the colon as 'in'
 */
public class forEachEx{
    public static void main(String[] args){
        
        //self indexing when printing array list
        ArrayList<String> words = new ArrayList<>();
        words.add("fone");
        words.add("phone");
        words.add("found");
        words.add("foul");

        //instead of printing by calling each index we can use a while loop

        int index = 0;
        while(index < words.size()){
            System.out.println(words.get(index));
            index++;
        }

        //however the best way to do this is by using a for-each loop - it is usually used when you want to iterate over a list or collection
        //also the variable has to be of the same type as the list so in this case the list is a string so you use a string variable
        for(String w : words)//this reads for the string variable w 'in' the list words do something something...here we are printing
        {
           System.out.println(w); 
        }

    }
}