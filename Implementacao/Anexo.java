import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Anexo {
    private static Anexo instancia;
    String nomeDoArquivo = "meuarquivo.txt";
    private FileWriter arquivoWriter;
    private Anexo() {}
    
    private static void criarAnexo() {
        try {
            instancia.arquivoWriter = new FileWriter("anexo");
            
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
            bufferEscrita.write("Este é o conteúdo do meu arquivo de texto: "+ conteudo);
            bufferEscrita.newLine(); 

            bufferEscrita.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
