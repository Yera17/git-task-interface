public interface Reader extends User {
    void takeBook(Administrator administrator, Book book);
    void returnBook(Administrator administrator, Book book);
}
