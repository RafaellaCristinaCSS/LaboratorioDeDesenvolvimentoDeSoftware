import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class Anexo {
    private static Anexo instancia;
    String nomeDoArquivo;
    private FileWriter arquivoWriter;

    private Anexo() {

    }

    private void criarAnexosNecessariosParaOSistema() {
        criarAnexo("CurriculosPorSemestre");
        criarAnexo("Alunos");
        criarAnexo("Disciplinas");
        preencherAnexos();
        criarAnexo("Professores");
        criarAnexo("Turmas");
    }

    private void preencherAnexos() {
        instancia.preencherAnexo("{'id': '01','nome': 'Matematica','obrigatoria': true,'ativa': true}", "Disciplinas");
        instancia.preencherAnexo("{'id': '02','nome': 'Português','obrigatoria': true,'ativa': true}", "Disciplinas");
        instancia.preencherAnexo("{'id': '03','nome': 'História','optativa': true,'ativa': true}", "Disciplinas");
        instancia.preencherAnexo("{'id': '04','nome': 'Geografia','optativa': true,'ativa': true}", "Disciplinas");
    }

    private static void criarAnexo(String nomeDoArquivo) {
        try {
            instancia.arquivoWriter = new FileWriter(nomeDoArquivo + ".txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String lerAnexo(String nomeDoArquivo) {
        StringBuilder conteudo = new StringBuilder();
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(nomeDoArquivo + ".txt"));
            String linha;
            while ((linha = leitor.readLine()) != null) {
                conteudo.append(linha);
                conteudo.append("\n");
            }
            leitor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return conteudo.toString();
    }

    public static Anexo getInstance() {
        if (instancia == null) {
            instancia = new Anexo();
            instancia.criarAnexosNecessariosParaOSistema();
        }
        return instancia;
    }

    public void preencherAnexo(String conteudo, String nomeDoArquivo) {
        try {
            FileWriter arquivoWriter = new FileWriter(nomeDoArquivo + ".txt", true);
            BufferedWriter bufferEscrita = new BufferedWriter(arquivoWriter);
            bufferEscrita.write(conteudo);
            bufferEscrita.newLine();

            bufferEscrita.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printarConteudoAnexoNoConsole(String nomeDoArquivo) {
        String conteudo = instancia.lerAnexo(nomeDoArquivo + ".txt");
        System.out.println(conteudo);
    }

    public void FiltrarAquivoPorIdDoElemento(String idDesejado, String nomeDoAquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoAquivo+".txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (linha.trim().startsWith("{") && linha.trim().endsWith("}")) {
                    linha = linha.trim().substring(1, linha.length() - 1).trim();

                    String[] pares = linha.split(",");
                    String id = null;
                    for (String par : pares) {
                        String[] partes = par.split(":");
                        if (partes.length == 2) {
                            String chave = partes[0].trim();
                            String valor = partes[1].trim();
                            if ("\'id\'".equals(chave)) {
                                id = valor.replace("\"", "").trim();
                            }
                        }
                    }
                    
                    if (id != null && id.equals("'"+idDesejado+"'")) {
                        System.out.println("Linha encontrada:");
                        System.out.println("{" + linha + "}");
                        break; 
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
