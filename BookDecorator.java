abstract class BookDecorator implements Displayable {
    protected Displayable decoratedBook;

    public BookDecorator(Displayable decoratedBook) {
        this.decoratedBook = decoratedBook;
    }

    public String display() {
        return decoratedBook.display();
    }
}
