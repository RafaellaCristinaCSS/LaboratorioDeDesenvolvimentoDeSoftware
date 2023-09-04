import java.util.List;
import java.util.Map;

public class Curso{
    private String nome;
    private int numeroDeCreditos;
    private List<Disciplina> disciplinas;
    private Map<String, Turma> turmas;

    public Curso(String nome, int numeroDeCreditos, List<Disciplina> disciplinas, Map<String, Turma> turmas) {
        this.nome = nome;
        this.numeroDeCreditos = numeroDeCreditos;
        this.disciplinas = disciplinas;
        this.turmas = turmas;
    }

    public Map<String, Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Map<String, Turma> turmas) {
        this.turmas = turmas;
    }

    public Curso(String nome, int numeroDeCreditos, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.numeroDeCreditos = numeroDeCreditos;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeCreditos() {
        return numeroDeCreditos;
    }

    public void setNumeroDeCreditos(int numeroDeCreditos) {
        this.numeroDeCreditos = numeroDeCreditos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}