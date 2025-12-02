package paquete2;

import paquete1.Clase1;    //No sucede nada, se puede importar correctamente ya que es public
//import paquete1.Clase2;   //No se puede importar ya que esta con un modificador default, que no permite acceder  otro archivo

public class App {
    public static void main(String[] args) throws Exception {
            System.out.println("Hola, Mundo!");
    }

    public void metodo1(Clase1 paquete1){
        paquete1.metodo1(); //Accede ya que esta publico
    }

    /*public void metodo2(Clase1 paquete1){
        paquete1.metodo2(); //No accede ya que esta en otro paquete, y protected solo permite acceder desde lamisma clase o desde otra subclase en otro paquete
    }*/

    /*public void metodo3(Clase1 paquete1){
        paquete1.metodo3(); //No accede porque private es aun más restrictivo que protected, solo se puede acceder desde la propia clase
    }*/

    /*public void metodo4(Clase1 paquete1){
        paquete1.metodo4(); //No accede ya que por default es mas restrictivo que protected, deja acceder desde el mismo paquete pero no desde otro
    }*/



}
