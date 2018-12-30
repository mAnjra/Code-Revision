public class charIncrement{
    public static void main(String[] args){
        char ch1;

        for(ch1 = 33;ch1<=127;ch1++){//why 33? look at the output from this program and then the Ascii table
            System.out.println(ch1);
        }
    }
    /**
     * Java uses Unicode which supports multiple languages 16bit wide which ranges from 0 - 65,536 - Java has to if it wants to achieve what it set out(worldwide usage) for
     * unlike other languages like c c++ who use 8bit ASCII - and java made it so that the first 127 charachters are 
     * from the ASCII table. 
     */
}