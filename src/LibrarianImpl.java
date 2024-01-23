public class LibrarianImpl extends UserImpl implements Librarian {

    public LibrarianImpl(String name) {
        super(name);
    }

    @Override
    public void orderBook(Supplier supplier) {
        System.out.printf("Библиотекарь '%s' заказал книгу у поставщика '%s'\n", getName(), supplier.getName());
    }
}
