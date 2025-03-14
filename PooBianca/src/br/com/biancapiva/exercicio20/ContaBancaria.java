package br.com.biancapiva.exercicio20;

public class ContaBancaria {
    String titular;
    double saldo;

    public ContaBancaria() {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String depositar(double valor) {
        saldo += valor;
        return titular;
    }
    public String sacar(double valor) {
        if (saldo > valor) {
            saldo -= valor;
            return titular;
        }
        return "";
    }
    public double exibirsaldo(double saldo){
        return saldo;
    }
}
