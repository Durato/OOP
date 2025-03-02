package br.com.biancapiva.exericicio11;

public class Aluno {
    public String nome;
    public int nota;

    public Aluno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }
    public boolean aprovado(){
      return nota >= 6.0;
    };
    public void resultado(){
        String status =  aprovado() ? "aprovado" : "reprovado";
        System.out.println(nome + "-" + status);
    };

}
