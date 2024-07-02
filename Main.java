public class Main {
    public static void main(String[] args) {
        try {
            // Прототип
            Book originalBook = new Book("Design Patterns", "Erich Gamma", 1994);
            Book clonedBook = (Book) originalBook.clone();

            System.out.println("Original Book: " + originalBook);
            System.out.println("Cloned Book: " + clonedBook);

            // Декоратор
            Displayable simpleBook = new SimpleBook("Clean Code", "Robert C. Martin", 2008);
            Displayable eBook = new EBookDecorator(simpleBook);
            Displayable audioBook = new AudioBookDecorator(simpleBook);

            System.out.println(eBook.display());
            System.out.println(audioBook.display());

            // Итератор
            BookCollection collection = new BookCollection();
            collection.addBook(originalBook);
            collection.addBook(clonedBook);

            for (Book book : collection) {
                System.out.println("Book in collection: " + book);
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
