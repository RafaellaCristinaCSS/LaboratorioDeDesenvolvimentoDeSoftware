import java.util.List;

public class Secretaria extends Usuario{
    public Secretaria(String nome, String email, String senha, String cpf) {
        super(nome, email, senha, cpf);
    }

    public void gerarCurriculoPorSemestre() {}

    public void armazenarInformacoes(List<Disciplina> disciplinas, List<Professor> professores, List<Aluno> alunos) {}
}