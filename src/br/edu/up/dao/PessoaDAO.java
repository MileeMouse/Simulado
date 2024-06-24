package br.edu.up.dao;

import br.edu.up.modelos.Pessoas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {
    private String filePath;

    public PessoaDAO(String filePath) {
        this.filePath = filePath;
    }

    public List<Pessoas> lerPessoas() {
        List<Pessoas> pessoas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linha;
            // Pula a primeira linha
            br.readLine();
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length == 2) {
                    Integer codigo = Integer.parseInt(dados[0].trim());
                    String nome = dados[1].trim();
                    pessoas.add(new Pessoas(nome, codigo));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pessoas;
    }
}
