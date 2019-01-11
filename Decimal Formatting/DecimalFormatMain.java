import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class DecimalFormatMain{
    public static void main(String[] args){
        DecimalPoint2 format = new DecimalPoint2();
        format.setValue(23.874876758);
        System.out.println(format);    
        format.toString();
        format.roundDecimalUP();
        format.roundDecimalDown();
        format.decimalFormatM();
        format.stringFormatM();
    }
}