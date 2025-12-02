
class FakeDatabaseService extends DatabaseSevice{
    
    @Override
    public void connect(){
        System.out.println("\u001b[32mTipo de BBDD: \u001b[35mFake\u001b[0m");
    }

    public FakeDatabaseService(){
        //Constructor vacio
    }
}