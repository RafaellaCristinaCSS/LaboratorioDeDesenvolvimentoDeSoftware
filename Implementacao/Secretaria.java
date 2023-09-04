import java.util.List;

public class Secretaria extends Usuario{
    private String[] curriculosPorSemestre;
    public Secretaria(String nome, String email, String senha, String cpf) {
        super(nome, email, senha, cpf);
    }
    
    private void armazenarInformacoes(String conteudo){
        Anexo anexo = Anexo.getInstance();
        anexo.preencherAnexo(conteudo);
    }

    public void gerarCurriculoPorSemestre(Disciplina disciplina, Professor professor, List<Aluno> alunos) {
        curriculosPorSemestre[curriculosPorSemestre.length-1]= "Os alunos: "+ alunos +" estão matriculados na disciplina "+ disciplina+" cujo o nome é "+ disciplina.nome +" ministrada pelo professor "+ professor;
        armazenarInformacoes(curriculosPorSemestre[curriculosPorSemestre.length-1]);
    }

    public void setCurriculosPorSemestre(String[] curriculosPorSemestre) {
        this.curriculosPorSemestre = curriculosPorSemestre;
    }
}