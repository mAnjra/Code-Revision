package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

    Set<String> dictionary;
    int duplicateCounter;

    public PersonalDuplicateRemover(){
        this.dictionary = new HashSet<String>();
    }

    @Override
    public void add(String characterString) {
        /*
       if(!this.dictionary.isEmpty()){
           for (String word : this.dictionary){
               if (characterString.equals(word)){
                   this.duplicateCounter++;
               }
           }
       }
         */
        if(this.dictionary.contains(characterString)){
            this.duplicateCounter++;
        }
       this.dictionary.add(characterString);

    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicateCounter;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.dictionary;
    }

    @Override
    public void empty() {
        this.dictionary.clear();
        this.duplicateCounter = 0;
    }
}
