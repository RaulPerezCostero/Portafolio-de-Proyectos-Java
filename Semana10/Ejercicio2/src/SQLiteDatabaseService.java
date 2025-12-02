public class SQLiteDatabaseService extends DatabaseSevice{
    
    @Override
    public void connect(){
        System.out.println("\u001b[32mTipo de BBDD: \u001b[35mSQLite\u001b[0m");
    }

    public SQLiteDatabaseService(){
        //Constructor vacio
    }
}
