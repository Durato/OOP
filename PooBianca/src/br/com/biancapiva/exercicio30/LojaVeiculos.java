package br.com.biancapiva.exercicio30;

public class LojaVeiculos {
    private String nomeLoja;
    private Double faturamento;

    public LojaVeiculos() {
    }

    public LojaVeiculos(String nomeLoja, Double faturamento) {
        this.nomeLoja = nomeLoja;
        this.faturamento = faturamento;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

    public double venderVeiculo(double valor) {
        return faturamento = valor + faturamento;

    }
    public double darDesconto(double valor) {
        if (valor < faturamento) {
            return faturamento = faturamento - valor;
        }
        else{
            System.out.println("Desconto exerce o valor do faturamento");
        }
        return valor;
    }

}
