import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario{
    private List<Turma> turmasMinistradas;
    public Professor(String nome, String email, String senha, String cpf) {
        super(nome, email, senha, cpf);
        this.turmasMinistradas = new ArrayList<>();
    }

    public void buscarAlunosPorDisciplinas() {
        for (Turma turma : turmasMinistradas) {
            List<Aluno> alunos = turma.getAlunosMatriculados();
            Disciplina disciplina = turma.getDisciplina();

            System.out.println("Disciplina: " + disciplina.getNome());
            System.out.println("Alunos matriculados:");

            for (Aluno aluno : alunos) {
                System.out.println("- " + aluno.getNome());
            }
        }
    }

    public List<Turma> getTurmasMinistradas() {
        return turmasMinistradas;
    }

    public void addTurmasMinistradas(Turma turmasMinistradas) {
        this.turmasMinistradas.add(turmasMinistradas);
    }
}