import java.util.Date;
import java.util.List;

public class Turma {
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos;
    private Date inicio;

    public Turma(Disciplina disciplina, Professor professor, List<Aluno> alunos, Date inicio) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = alunos;
        this.inicio = inicio;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunos;
    }

}
