package PersonalMultipleEntryDictionary;

import java.util.Set;

public interface MultipleEntryDictionary {

    void add(String word, String entry);
    Set<String> translate(String translate);
    void remove(String word);
}
