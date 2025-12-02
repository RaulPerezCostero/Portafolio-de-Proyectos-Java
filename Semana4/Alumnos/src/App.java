import com.coti.tools.Esdia;

import model.Alumno;

public class App {

    

    public static void main(String[] args) throws Exception {
        int numAlumnos = Esdia.readInt("Introduce el numero de alumnos: ");
        double sumaTotal = 0.0;
        int i=0;

        Alumno[] vectorNotas = new Alumno[numAlumnos];

        while(i < numAlumnos){
            String nombre = Esdia.readString("Introduce el nombre del alumno: ");
            System.out.printf("\u001b[31m-----Notas de %s-----\u001b[0m\n",nombre);
            float notaParcial1 = Esdia.readFloat("Introduce la nota del primer examen parcial del alumno: ");
            float notaParcial2 = Esdia.readFloat("Introduce la nota del segundo examen parcial del alumno: ");
            float notaFinal = Esdia.readFloat("Introduce la nota del examen final del alumno: ");

            vectorNotas[i] = new Alumno(nombre,notaParcial1,notaParcial2,notaFinal);
            i++;
        }

        
        System.out.println();
        for (Alumno alumno : vectorNotas) {

            double media = alumno.Media();
            sumaTotal = sumaTotal + media;
            System.out.printf("| %s | %.2f %.2f %.2f | \u001b[32m%4.2f\u001b[0m | \n",
                        alumno.getNombre(),
                        alumno.getParcial1(),
                        alumno.getParcial2(),
                        alumno.getExamenFinal(),
                        alumno.Media());
                        
        }
        System.out.println();
        double mediaTotal=sumaTotal/numAlumnos;
            System.out.printf("\u001b[32mLa nota media de la clase es: %.2f\u001b[0m" ,mediaTotal);
        
    }

}
