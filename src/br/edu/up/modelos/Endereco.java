package br.edu.up.modelos;

public class Endereco {
    private String rua;
    private String cidade;
    private Integer codigoPessoa;

    public Endereco(String rua, String cidade, Integer codigoPessoa) {
        this.rua = rua;
        this.cidade = cidade;
        this.codigoPessoa = codigoPessoa;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getCodigoPessoa() {
        return codigoPessoa;
    }

    public void setCodigoPessoa(Integer codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", cidade='" + cidade + '\'' +
                ", codigoPessoa=" + codigoPessoa +
                '}';
    }
}
