import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class BookCollection implements Iterable<Book> {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(books);
    }

    private class BookIterator implements Iterator<Book> {
        private int index = 0;
        private List<Book> books;

        public BookIterator(List<Book> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public Book next() {
            return books.get(index++);
        }
    }
}
