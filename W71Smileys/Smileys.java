
public class Smileys {

    public static void printSmileyEven(String chaString) {
        int smileyLength = chaString.length() / 2 + 2;
        for (int i = 0; i <= smileyLength; i++) {
            System.out.print(":)");
        }System.out.println();
    }

    public static void printSmileyOdd(String chString) {
        int smileyLength = chString.length() / 2 + 3;
        for (int i = 0; i <= smileyLength; i++) {
            System.out.print(":)");
        }System.out.println();
    }

    public static void printWithSmileys(String chaString) {
        if (chaString.length() % 2 == 1) {
            printSmileyOdd(chaString);
            System.out.println(":) " + chaString + " " + " :)");
            printSmileyOdd(chaString);
        } else {
            printSmileyEven(chaString);
            System.out.println(":) " + chaString + " :)");
            printSmileyEven(chaString);
        }
    }

    public static void main(String[] args) {
        printWithSmileys("\\:D/");
    }
}