package br.edu.up.tela;

import br.edu.up.controle.PessoaController;

public class Main {
    public static void main(String[] args) {
        String pessoaFilePath = "bin/br/edu/up/data/pessoa.csv";
        String enderecoFilePath = "bin/br/edu/up/data/endereço.csv";

        PessoaController controller = new PessoaController(pessoaFilePath, enderecoFilePath);

        System.out.println("----- Pessoas e seus enderecos -----");
        controller.mostrarPessoasComEnderecos();
    }
}
