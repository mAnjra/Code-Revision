public class ElegantArrayPrint{
    public static void main(String[] args){
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            System.out.print(array[i] + ", ");
        } 
        System.out.print(array[array.length - 1]);// prints value at index array.length -1  
    }
}