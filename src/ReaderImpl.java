public class ReaderImpl extends UserImpl implements Reader{
    public ReaderImpl(String name) {
        super(name);
    }

    @Override
    public void takeBook(Administrator administrator, Book book) {
        System.out.printf("Читатель '%s' взял книгу '%s' на неделю у администратора '%s'\n",
                getName(), book.getTitle(), administrator.getName());
    }

    @Override
    public void returnBook(Administrator administrator, Book book) {
        System.out.printf("Читатель '%s' вернул книгу '%s' администратору '%s'\n",
                getName(), book.getTitle(), administrator.getName());
    }
}
