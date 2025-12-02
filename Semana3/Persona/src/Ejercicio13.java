import model.Persona13;

public class Ejercicio13 {
    public static void main(String[] args) {
        // Creación de un objeto de la clase Person
        Persona13 paco = new Persona13("Paco",22,177.3f,82.3f);
        // Copiamos la referencia del objeto anterior a otra referencia
        Persona13 refPaco2 = paco;
        // Utilizamos la segunda referencia para establecer un valor en el objeto al que
        refPaco2.setEdad( 77);
        // ¿Resultado? 77
        System.out.printf("La edad de %s es: %d%n",paco.getNombre(),paco.getEdad());
        // ¿Cuál es la edad que se muestra? Se muestra que la edad de Paco es de 77 años.
        // ¿Cuántos objetos hay en memoria? ¿Cuántas referencias? Revisa el Debugger.
        //En memoria solo hay un objeto que es el que creamos con new y hay dos referencias las cuales son Paco y refPaco2 que apuntan a un mismo objeto.
        }
        
}

