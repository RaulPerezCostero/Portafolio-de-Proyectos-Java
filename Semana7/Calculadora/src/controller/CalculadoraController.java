package controller;

import model.CalculadoraModel;
import view.CalculadoraView;

public class CalculadoraController {
    CalculadoraView view;
    CalculadoraModel model;

    public CalculadoraController(CalculadoraView view, CalculadoraModel model){
        this.view = view;
        this.model = model;

        this.view.setController(this);
    }

    public void guardarNumeros( int primerNumero, int segundoNumero){
        model.setNum1(primerNumero);
        model.setNum2(segundoNumero);
    }

    public void calcularSuma(){
        model.sum();
    }

    public int getPrimerNunmero(){
        return model.getNum1();
    }
    
    public int getSegundoNunmero(){
        return model.getNum2();
    }
    
    public int getResultado(){
        return model.getResult();
    }

    public void run() {
        this.view.showMenu();
    }
}
