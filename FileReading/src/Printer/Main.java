package Printer;

public class Main {
    public static void main(String[] args) throws Exception{
        Printer printer = new Printer("/Users/Azhar/Desktop/textfile.txt");

        printer.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");
    }
}
