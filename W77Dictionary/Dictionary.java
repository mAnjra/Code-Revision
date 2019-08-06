package Dictionary;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary(){
        this.dictionary = new HashMap<String, String>();
    }

    // gets the word at the chosen key(word)
    public String translate(String word){
        if(this.dictionary.containsKey(word)){
           return this.dictionary.get(word);
        }
        return null;
    }

    public void add(String word, String translation){

        this.dictionary.put(word, translation);
    }

    public int amountOfWords(){
        return this.dictionary.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> tl = new ArrayList<>();
        this.dictionary.entrySet().forEach(k -> tl.add( k.getKey()+" = "+k.getValue()));
        return tl;
    }

}
