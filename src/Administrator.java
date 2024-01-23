public interface Administrator extends User{
    void overdueNotification(Reader reader, Book book);
}
