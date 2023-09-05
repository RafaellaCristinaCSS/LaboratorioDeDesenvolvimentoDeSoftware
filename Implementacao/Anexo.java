import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class Anexo {
    private static Anexo instancia;
    String nomeDoArquivo = "meuarquivo.txt";
    private FileWriter arquivoWriter;

    private Anexo() {
    }

    private static void criarAnexo() {
        try {
            instancia.arquivoWriter = new FileWriter(instancia.nomeDoArquivo);

            System.out.println("Arquivo criado com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Anexo getInstance() {
        if (instancia == null) {
            instancia = new Anexo();
            instancia.criarAnexo();
        }
        return instancia;
    }

    public void preencherAnexo(String conteudo) {
        BufferedWriter bufferEscrita = new BufferedWriter(instancia.arquivoWriter);
        try {
            bufferEscrita.write("Este é o conteúdo do meu arquivo de texto: " + conteudo);
            bufferEscrita.newLine();

            bufferEscrita.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String lerAnexo() {
        StringBuilder conteudo = new StringBuilder();
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(nomeDoArquivo));
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
    public void printarConteudoAnexoNoConsole(){
       String conteudo =  lerAnexo();
       System.out.println(conteudo);
    }
}
