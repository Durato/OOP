package br.com.biancapiva.exercicio26;

public class Principal {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(4);
        retangulo.setAltura(5);

        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.calcularPerimetro());
    }
}
