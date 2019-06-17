import java.util.Arrays;

public class Copy{
    
    public static int[] copy(int[] array){
        int[] copied = new int[array.length];
        int i = 0;
        for(int t : array){
            copied[i] = t;
            i++;
        }
        return copied;
    }

    public static int[] reverseCopy(int[] array){
        int[] copied = new int[array.length];
        int o = 0;
        for(int i = array.length-1 ; i >= 0; i--){
            copied[o] = array[i];
            o++;
        }
        return copied;
    }

    public static void main(String[] args){
        int[] original = {1,2, 3, 4};
        int[] copied = reverseCopy(original);

        //copied[0] = 99;

        System.out.println("Original: "+ Arrays.toString(original));
        System.out.println("Copied: " + Arrays.toString(copied));

    }
}