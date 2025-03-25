package br.com.biancapiva.exercicio28;

public class Tabuada {
    private int numero;

    public Tabuada() {
    }

    public Tabuada(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int calcularTabuada(){
        for(int i = 0 ; i <= 10; i++){
            int tabuada = numero * i;
            System.out.println("Tabuada: " + numero + "X" + i + " = " + tabuada);
        }
        return 0;
    }
}
