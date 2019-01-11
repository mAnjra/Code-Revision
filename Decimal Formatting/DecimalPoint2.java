import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * This class will display a few examples on how to 
 * format a double variable to 2 decimal places.
 */
public class DecimalPoint2{

     
    private double value;
    

    public DecimalPoint2(){
    }

    public void setValue(double value){
        this.value = value;
    }

    //Using Decimal Format
    public void decimalFormatM(){
        DecimalFormat df2 = new DecimalFormat(".##");
        System.out.println("Decimal Format default(HALF_EVEN): "+df2.format(this.value));
    }

    //Using Decimal format rounding mode - by default it is set to RoundingMode.HALF_EVEN
    public void roundDecimalUP(){
        DecimalFormat df2 = new DecimalFormat(".##");
        df2.setRoundingMode(RoundingMode.UP);
        System.out.println("Decimal Format (UP): "+df2.format(this.value));
    }

    public void roundDecimalDown(){
        DecimalFormat df2 = new DecimalFormat(".##");
        df2.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Decimal Format (DOWN): "+df2.format(this.value));

    }

    //String Format method
    public void stringFormatM(){
        System.out.println("String Format: "+String.format("%.2f", this.value));
    }

    @Override
    public String toString(){
        return "Initial value: "+ this.value;
    }

}