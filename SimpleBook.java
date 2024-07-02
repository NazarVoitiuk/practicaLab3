public class SimpleBook implements Displayable {
    private String title;
    private String author;
    private int year;

    public SimpleBook(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String display() {
        return title + " by " + author + " (" + year + ")";
    }
}
