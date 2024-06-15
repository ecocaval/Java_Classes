package aula1_felipe;

public class Pessoa {

    public String nome;
    private String senha;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String mostrarSenha() {
        return this.senha;
    }

}
