package br.edu.up.controle;

import br.edu.up.dao.PessoaDAO;
import br.edu.up.dao.EnderecoDAO;
import br.edu.up.modelos.Pessoas;
import br.edu.up.modelos.Endereco;

import java.util.List;

public class PessoaController {
    private PessoaDAO pessoaDAO;
    private EnderecoDAO enderecoDAO;

    public PessoaController(String pessoaFilePath, String enderecoFilePath) {
        this.pessoaDAO = new PessoaDAO(pessoaFilePath);
        this.enderecoDAO = new EnderecoDAO(enderecoFilePath);
    }

    public List<Pessoas> listarPessoas() {
        return pessoaDAO.lerPessoas();
    }

    public List<Endereco> listarEnderecos() {
        return enderecoDAO.lerEnderecos();
    }

    public void mostrarPessoasComEnderecos() {
        List<Pessoas> pessoas = listarPessoas();
        List<Endereco> enderecos = listarEnderecos();

        for (Pessoas pessoa : pessoas) {
            System.out.println(pessoa.getNome() + " (" + pessoa.getCodigo() + "):");
            for (Endereco endereco : enderecos) {
                if (endereco.getCodigoPessoa().equals(pessoa.getCodigo())) {
                    System.out.println("  - Rua: " + endereco.getRua() + ", Cidade: " + endereco.getCidade());
                }
            }
        }
    }
}
