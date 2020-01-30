import java.io.File;
import java.util.Scanner;

public class CharacterSet {
    /**
     * When it comes to reading files its important for java to know
     * exactly what character set the operating system is using. Knowing the character set
     * allows you to save text on the hard disk in binary format, and to translate binary back into
     * text.
     *
     * Most support it but if you run into to a problem with for example characters with accents then
     * add the required character set to the end of the scanner parameter
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        File f = new File("testfile.txt");
        Scanner read = new Scanner(f, "UTF-8");
    }
}
