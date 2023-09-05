import java.util.List;
public class Secretaria extends Usuario{

    private Anexo anexo = Anexo.getInstance(); 
    
    private String curriculosPorSemestre;
    public Secretaria(String nome, String email, String senha, String cpf) {
        super(nome, email, senha, cpf);
    }
    
    private void armazenarInformacoes(String conteudo){
        anexo.preencherAnexo(conteudo, "CurriculosPorSemestre");
    }

    public void gerarCurriculoPorSemestre(String disciplina, String professor, List<Aluno> alunos) {
        curriculosPorSemestre= "Os alunos: "+ alunos +" estão matriculados na disciplina "+ disciplina+" cujo o nome é "+ disciplina +" ministrada pelo professor "+ professor;
        armazenarInformacoes(curriculosPorSemestre);
    }

    public void setCurriculosPorSemestre(String curriculosPorSemestre) {
        anexo.printarConteudoAnexoNoConsole("CurriculosPorSemestre"); 
    }
}