import java.util.ArrayList;

public class App{

    public static void main(String[] args) throws Exception {
        ArrayList<DatabaseSevice> arrayBases = new ArrayList<>();
        
        
        FakeDatabaseService item1 = new FakeDatabaseService();
        MySQLDatabaseService item2 = new MySQLDatabaseService();
        SQLiteDatabaseService item3 = new SQLiteDatabaseService();
        DatabaseSevice llamada = new DatabaseSevice();

        arrayBases.add(item1);
        arrayBases.add(item2);
        arrayBases.add(item3);

        System.out.println();
        System.out.println("----------------------");
        
        for (DatabaseSevice Base :  arrayBases) {
            llamada.connect();
            Base.connect();
            System.out.println("----------------------");
        }

    }
}
