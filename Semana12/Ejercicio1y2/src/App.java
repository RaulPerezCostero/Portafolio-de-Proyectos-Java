
public class App {
    public static void main(String[] args) throws Exception {
        try {
            // Prueba con un parámetro inválido para lanzar la excepción
            Object obj = FactoryMethod.createObject("");
        } catch (MyCheckedException e) {
            // Manejar la excepción
            System.out.println("\u001b[31mExcepción capturada: " + e.getMessage());
        }

        // Ejemplo de excepción unchecked
        throw new MyUncheckedException("\u001b[30mEsto es una excepción unchecked\u001b[0m");
        
        
    }
    
}
