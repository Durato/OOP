package br.com.biancapiva.exercicio26;

public class Retangulo {
    private int altura;
    private int largura;

    public Retangulo() {
    }

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
    public int calcularPerimetro() {
        return largura + altura + largura + altura;
    }
    public int calcularArea(){
        return largura * altura;
    }
}
