
/*
1.Tendrá valores null ya que no se le ha especificado ninguno. La longitude será de siete.

2.No es posible modificarla una vez inicializada ya que esta declarada como final.

3.Es posible acceder sin hacer un new ya que out es un atributo estático y entonces se puede acceder directamente.

4.import se usa para importar clases mientras que import static sirve para hacer lo mismo pero permite llamar a los atributos
sin tener que usar el nombre de la clase.

5.Se produce ya que se intenta usar un this en un metodo estático, para solucionarlo lo podemos eliminar,
y si no podemos hacerlo porque necesitamos el this podemos cambiar el metodo a no estatico.
*/

////////////Ejemplo////////////// (Con static)

import static java.lang.Math.*;
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(PI);
    }
}

////////////Ejemplo////////////// (Sin static, cambiar los comentario para verlo)

/*import java.lang.Math.*;
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(Math.PI); //Hay que llamar a la clase (Math)
    }
}*/