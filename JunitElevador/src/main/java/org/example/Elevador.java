package org.example;

public class Elevador {
    private int id;
    private double cargaMaxima;
    private double cargaAtual;
    private boolean sinalAlerta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(double cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public boolean isSinalAlerta() {
        return sinalAlerta;
    }

    public void setSinalAlerta(boolean sinalAlerta) {
        this.sinalAlerta = sinalAlerta;
    }


    public double entrarNoElevador(double peso){
        Calculadora calc = new Calculadora();
        this.cargaAtual = calc.somar(peso, this.cargaAtual);
        return cargaAtual;
    }

    public double sairDoElevador(double peso){
        Calculadora calc = new Calculadora();
        cargaAtual = calc.subtrair(cargaAtual, peso);
        return cargaAtual;
    }

    public boolean avaliarPeso(double peso){
        this.sinalAlerta = peso > cargaMaxima;
        return sinalAlerta;
    }

}
