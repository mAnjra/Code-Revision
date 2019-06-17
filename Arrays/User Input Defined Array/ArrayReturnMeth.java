public class ArrayReturnMeth {
    public static String[] giveStringTable() {
        // String[] teachers = new String[3];
        String[] teachers = new String[3];
        teachers[0] = "Bonus";
        teachers[1] = "ihq";
        teachers[2] = "Lennon";

        return teachers;
    }

    //The above method is primed to return a an array, lets add that to an arrray

    public static void main(String[] args){
        String[] teachers = giveStringTable(); //this method will return the array into this

        for(String t : teachers){
            System.out.println(t);
        }

    }
}