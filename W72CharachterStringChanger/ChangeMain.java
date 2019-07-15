public class ChangeMain{
    public static void main(String[] args){
        String word = "Carrot";
        Change change1 = new Change('a', 'b');
        word = change1.change(word);
        System.out.println(word);

    }
}