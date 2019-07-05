import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        /*
        System.out.println("Smallest: " + smallest(values));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
        System.out.println(Arrays.toString(values));
        swap(values, 1, 0);
        System.out.println(Arrays.toString(values));
        swap(values, 0, 3);
        System.out.println(Arrays.toString(values)); */
        
        sort(values);

    }

    public static int smallest(int[] array){
        int temp = array[0];
        for(int i = 0; i < array.length; i++){
            if(temp>array[i]){
                temp = array[i];
            }

        }
        return temp;
    }

    public static int indexOfTheSmallest(int[] array){
        int temp = array[0];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(temp> array[i]){
                index = i;
                temp = array[i];
            }
        }
      return index;  
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int temp = array[index];
        int loop = index;
        for(int i = loop; i<array.length; i++){
            if(temp>array[i]){
                loop = i;
                temp = array[i];
            }
        }return loop;
    }

    public static void swap(int[] array, int index1, int index2){
        int swap1 = array[index1];//0
        int swap2 = array[index2];//
        array[index1] = swap2;
        array[index2] = swap1;
    }

    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length; i++){
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
        
    }


}