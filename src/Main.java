public class Main {
    public static void main(String[] args) {
        Librarian librarian = new LibrarianImpl("Вася");
        Supplier supplier = new SupplierImpl("Дима");
        Reader reader = new ReaderImpl("Алексей");
        Administrator administrator = new AdministratorImpl("Mария");

        Book book = new Book("Война и мир");

        librarian.orderBook(supplier);

        supplier.giveBook(librarian);

        reader.takeBook(administrator, book);

        administrator.overdueNotification(reader, book);

        reader.returnBook(administrator, book);
    }
}
