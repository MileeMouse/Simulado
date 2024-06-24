package br.edu.up.modelos;

public class Pessoas {
    private String nome;
    private Integer codigo;

    public Pessoas(String nome, Integer codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public Pessoas() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
