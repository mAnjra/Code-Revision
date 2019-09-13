package GenericsExample;

/**
 * One class able to use two types safely
 * using Generics. Generics allows us to use
 * one class but not have a definitive type.
 * Examples Hashmap, ArrayList
 */
public class Main {
    public static void main(String[] args) {

        // string version
        Slot<String> stringSlot = new Slot<>("String slot");
        System.out.println(stringSlot.getKey());

        // int version
        Slot<Integer> intSlot = new Slot<>(14);
        System.out.println(intSlot.getKey());
    }
}
