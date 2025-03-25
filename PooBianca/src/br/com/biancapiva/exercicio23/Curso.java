package br.com.biancapiva.exercicio23;

public class Curso {
    String nomecurso;
    int codigocurso;

    public Curso() {
    }

    public Curso(String nomecurso, int codigocurso) {
        this.nomecurso = nomecurso;
        this.codigocurso = codigocurso;
    }

    public String exibirCurso() {
        return "Nome Curso: " + nomecurso + "\nCodigo Curso: " + codigocurso;
    }

}
