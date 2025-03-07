abstract class Database {
    abstract void connect();
    void disconnect() {
        System.out.println("Database disconnected");
    }
}
class Mydata extends Database {
    void connect() {
        System.out.println("Database connected");
    }
}

public class AbstractEx2
{
}
