package PersonalMultipleEntryDictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMutipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> dictionary;

    public PersonalMutipleEntryDictionary() {
        this.dictionary = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        // check to see the word exist if it not - create it.
        if(!this.dictionary.containsKey(word)){
            this.dictionary.put(word, new HashSet<String>());
        }
        // if the word does exist - add new translation
        Set<String> helperVari = this.dictionary.get(word);
        helperVari.add(entry);
        //this.dictionary.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String translate) {
        Set<String> tempSet = new HashSet<String>();
        if(!this.dictionary.containsKey(translate)){
            return null;
        }
        for(String s : this.dictionary.get(translate)){
            tempSet.add(s);
        }
        return tempSet;
    }

    @Override
    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
