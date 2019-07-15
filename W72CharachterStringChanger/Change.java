public class Change {

    private char fromCharachter;
    private char toCharachter;

    public Change(char fromCharachter, char toCharachter) {
        this.fromCharachter = fromCharachter;
        this.toCharachter = toCharachter;
    }

    public String change(String change) {
        return change.replace(fromCharachter, toCharachter);
    }
}