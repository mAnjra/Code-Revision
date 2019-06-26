public class StringUtils{
    public static boolean included(String word, String searched){
        word = word.toLowerCase().trim();
        searched = searched.toLowerCase().trim();
        if(word != null && searched != null){
            return word.contains(searched); // CONTAINS is a boolean method, this is simply returning true if the statement is true
        }
        return false;
    }
}