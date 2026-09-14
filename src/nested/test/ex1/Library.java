package nested.test.ex1;

public class Library {
    private final int capacity;
    private int size;
    private final Book[] books;

    public Library(int capacity) {
        this.capacity = capacity;
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(String title, String author) {
        if (size < capacity) {
            Book book = new Book(title, author);
            books[size] = book;
            size += 1;
        }
        else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static class Book {
        private final String title;
        private final String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "도서 제목: " + title + ", 저자: " + author;
        }
    }
}