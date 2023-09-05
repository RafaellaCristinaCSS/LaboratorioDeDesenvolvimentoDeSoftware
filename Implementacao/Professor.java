import java.util.List;

public class Professor extends Usuario{
        public Professor(String nome, String email, String senha, String cpf) {
        super(nome, email, senha, cpf);
    }

        public void buscarAlunosPorDisciplinas(List<Turma> turmas) {
        for (Turma turma : turmas) {
            List<Aluno> alunos = turma.getAlunosMatriculados();
            Disciplina disciplina = turma.getDisciplina();

            System.out.println("Disciplina: " + disciplina.getNome());
            System.out.println("Alunos matriculados:");

            for (Aluno aluno : alunos) {
                System.out.println("- " + aluno.getNome());
            }

            System.out.println();
        }
    }

}