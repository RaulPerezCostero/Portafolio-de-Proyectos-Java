package model;

public class Partido {
    private String local;
    private String visitante;
    private String resultado;

    public Partido(){
        //Constructor vacio.
    }
    
    public Partido(String local, String visitante, String resultado) {
        this.local = local;
        this.visitante = visitante;
        this.resultado = resultado;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    
}
