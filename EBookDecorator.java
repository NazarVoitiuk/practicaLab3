public class EBookDecorator extends BookDecorator {
    public EBookDecorator(Displayable decoratedBook) {
        super(decoratedBook);
    }

    @Override
    public String display() {
        return "E-Book: " + super.display();
    }
}
