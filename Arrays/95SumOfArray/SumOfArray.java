public class SumOfArray{
    public static void main (String[] args){
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        int i = 0;
        for(int number : array){
            i += number;
        }

        return i;
    }
}