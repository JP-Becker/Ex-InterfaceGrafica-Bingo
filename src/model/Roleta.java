package model;

import java.util.Random;

public class Roleta {

    private int numero;
    private int qtdFaltante;

    public Roleta() {
        this(0, 0);
    }

    public Roleta(int numero, int qtdFaltante) {
        this.numero = numero;
    }
    
    public int getQtdFaltante() {
        return qtdFaltante;
    }

    public void setQtdFaltante(int qtdFaltante) {
        this.qtdFaltante = qtdFaltante;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
