package model;

public class Persona11 {

    private String nombre = "sin nombre"; //Primero se inicializa el atributo
    private double peso;
    private double talla;
    private int dni;

    public Persona11(){
        this.nombre = "Desconocido";
        this.peso = 80; //por ejemplo, para inicializar.
        this.talla = 1.80; //por ejemplo, para inicializar.
    }

    public Persona11(int dni){
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    
    //Calculamos el IMC
    public double getIMC() {
        if (talla > 0) {
            return peso / (talla * talla)*10000;
        } else {
            return 0;
        }
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void getDni(){
        int r = dni%23;
        if(r == 0){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"T\u001b[0m");
        }else if(r == 1){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"R\u001b[0m");
        }else if(r==2){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"W\u001b[0m");
        }else if(r==3){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"A\u001b[0m");
        }else if(r==4){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"G\u001b[0m");
        }else if(r==5){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"M\u001b[0m");
        }else if(r==6){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"Y\u001b[0m");
        }else if(r==7){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"F\u001b[0m");
        }else if(r==8){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"P\u001b[0m");
        }else if(r==9){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"D\u001b[0m");
        }else if(r==10){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"X\u001b[0m");
        }else if(r==11){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"B\u001b[0m");
        }else if(r==12){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"N\u001b[0m");
        }else if(r==13){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"J\u001b[0m");
        }else if(r==14){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"Z\u001b[0m");
        }else if(r==15){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"S\u001b[0m");
        }else if(r==16){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"Q\u001b[0m");
        }else if(r==17){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"V\u001b[0m");
        }else if(r==18){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"H\u001b[0m");
        }else if(r==19){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"L\u001b[0m");
        }else if(r==20){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"C\u001b[0m");
        }else if(r==21){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"K\u001b[0m");
        }else if(r==22){
            System.out.println("\u001b[32mSu letra del DNI es: "+dni+"E\u001b[0m");
        }
    }
}
