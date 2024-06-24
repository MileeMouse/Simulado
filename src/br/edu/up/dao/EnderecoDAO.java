package br.edu.up.dao;

import br.edu.up.modelos.Endereco;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EnderecoDAO {
    private String filePath;

    public EnderecoDAO(String filePath) {
        this.filePath = filePath;
    }

    public List<Endereco> lerEnderecos() {
        List<Endereco> enderecos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linha;
            // Pula a primeira linha
            br.readLine();
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length == 3) {
                    String rua = dados[0].trim();
                    String cidade = dados[1].trim();
                    Integer codigoPessoa = Integer.parseInt(dados[2].trim());
                    enderecos.add(new Endereco(rua, cidade, codigoPessoa));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return enderecos;
    }
}
