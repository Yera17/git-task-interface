import java.sql.SQLOutput;

public class AdministratorImpl extends UserImpl implements Administrator{
    public AdministratorImpl(String name) {
        super(name);
    }

    @Override
    public void overdueNotification(Reader reader, Book book) {
        System.out.printf("Читатель '%s' занял книгу '%s' на неделю\n",reader.getName(),book.getTitle());
    }
}
