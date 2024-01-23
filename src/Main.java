public class Main {
    public static void main(String[] args) {
        Librarian librarian = new LibrarianImpl("Вася");
        Supplier supplier = new SupplierImpl("Дима");

        librarian.orderBook(supplier);

        supplier.giveBook(librarian);
    }
}
