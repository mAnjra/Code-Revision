public class BinarySearch{
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,9,12,18,43,56};
        int first = 0; int last = array.length-1; int middle = (first + last)/2;
        int search = 44;
        while(first<=last){
            if(array[middle] < search){
                first = middle + 1;// because search is already done middle index so we move up one
            }else if(array[middle] == search){
                System.out.println("Found at index: " + middle);
                break;
            }else{
                last = middle - 1; //same here with minus 1
            }
            middle = (first + last)/2;
        }
    }
}