import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/***
 * Class showing connection between Collection Map Set
 * Map and Set both implement Collection.
 * hashMap implements map.
 */

public class CollectionExample {
    public static void main(String[] args) {

        Map<String, String> translations = new HashMap<String, String>();
        translations.put("gambatte", "good luck");
        translations.put("hai", "yes");
        // keys - now has a set of keys from translation.
        Set<String> keys = translations.keySet();

        // Map and Set both implement Collection interface
        Collection<String> keySet  = keys;

        // traverse and print keys from Collection variable
        System.out.println("Keys:");
        for(String key : keySet){
            System.out.println(key);
        }

        System.out.println();
        System.out.println("Values:");
        Collection<String> values = translations.values();
        for (String value: values){
            System.out.println(value);
        }

        //This would work as well, above example shows connection between Collection-Map,Set-
        Map<String, String> translation = new HashMap<String, String>();
        translations.put("gambatte", "good luck");
        translations.put("hai", "yes");
        // KEYS
        System.out.println("Keys:");
        for(String key : translations.keySet()){
            System.out.println(key);
        }
        // VALUES
        System.out.println("\n"+"Values:");
        for (String value : translations.values()){
            System.out.println(value);
        }

    }
}
