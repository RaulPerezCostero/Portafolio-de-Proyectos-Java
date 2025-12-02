
public class MySQLDatabaseService extends DatabaseSevice{
    
    @Override
    public void connect(){
        System.out.println("\u001b[32mTipo de BBDD: \u001b[35mSQL\u001b[0m");
    }

    public MySQLDatabaseService(){
        //Constructor vacio
    }
}
