public class SupplierImpl extends UserImpl implements Supplier {
    public SupplierImpl(String name) {
        super(name);
    }

    @Override
    public void giveBook(Librarian librarian) {
        System.out.printf("Поставщик '%s' доставил книгу библиотекарю '%s'\n", getName(), librarian.getName());
    }
}
