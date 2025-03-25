package br.com.biancapiva.exercicio22;

public class Retangulo {
    int largura;
    int altura;

    public Retangulo() {
    }

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public int calcularArea() {
        return largura * altura;
    }
    public int calcularPerimetro() {
        return largura + altura + largura + altura;
    }

}
