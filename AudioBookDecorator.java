public class AudioBookDecorator extends BookDecorator {
    public AudioBookDecorator(Displayable decoratedBook) {
        super(decoratedBook);
    }

    @Override
    public String display() {
        return "Audio Book: " + super.display();
    }
}
