package br.com.biancapiva.exercicio25;

public class ContaBancaria {
    private double saldo;
    private int numerodaconta;
    private String titular;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo, int numerodaconta, String titular) {
        this.saldo = saldo;
        this.numerodaconta = numerodaconta;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumerodaconta() {
        return numerodaconta;
    }

    public void setNumerodaconta(int numerodaconta) {
        this.numerodaconta = numerodaconta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String exibirContaBancaria() {
        return "Numero da conta: " + numerodaconta + "\nTitular da conta: " + titular + "\nSaldo da conta: " + saldo;
    }
}
