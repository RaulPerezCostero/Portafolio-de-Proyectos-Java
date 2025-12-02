package view;

import com.coti.tools.Esdia;

import controller.Controller;

public class ConsoleListaView extends BaseView {

    @Override
    public void init() {
        System.out.println("GESTION DE ALUMNOS");
    }

    @Override
    public void showMenuPrincipal() {
        int option;
        
        do{
            System.out.println("1. alumnosImportados");
            System.out.println("2. bajas");
            System.out.println("3. importar");
            System.out.println("4. exportar");
            System.out.println("5. listar alumnos");
            System.out.println("6. salir");

            option = Esdia.readInt("Elige una opcion (1-6): ");

            switch (option) {
                case 1:
                    agregarAlumno();
                    break;
                
                case 2:
                    bajaAlumno();
                    break;

                case 3:
                    importarAlumno();
                    break;
                
                case 4:
                    exportarAlumno();
                    break;

                case 5:
                    listar();
                    break;
                
                case 6:
                    System.out.println("Adios!!!");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (option != 6);
    }

    public void agregarAlumno(){

    }

    public void bajaAlumno(){
        
    }

    public void importarAlumno(){
        
    }

    public void exportarAlumno(){
        
    }

    public void listar(){
        
    }

    @Override
    public void showError(String msg) {
        System.out.println(msg);
    }

    @Override
    public void showMsg(String msg) {
        System.out.println(msg);
    }

    @Override
    protected void setController(Controller controller) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setController'");
    }

}
