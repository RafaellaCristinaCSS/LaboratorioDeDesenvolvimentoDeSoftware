import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Aluno extends Usuario{
    public Aluno(String nome, String email, String senha, String cpf) {
        super(nome, email, senha, cpf);
        this.turmasMatriculadas = new ArrayList<>();
        this.disciplinasAtivas = new ArrayList<>();
        this.disciplinasCursadas = new ArrayList<>();
    }


    private String[] notificacoes;
    private int NumeroDeCreditos;

    private List<Disciplina> disciplinasAtivas;
    private List<Turma> turmasMatriculadas;
    private List<Disciplina> disciplinasCursadas;
    private Curso curso;


    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Disciplina> getDisciplinasRestantes() {
        Set<String> nomeDisciplinasCursadas = disciplinasCursadas.stream().map(Disciplina::getNome).collect(Collectors.toSet());
        disciplinasAtivas.forEach(d -> nomeDisciplinasCursadas.add(d.getNome()));
        return curso.getDisciplinas().stream().filter(c -> !nomeDisciplinasCursadas.contains(c.getNome())).collect(Collectors.toList());
    }

    public void imprimirDisciplinasRestantes() {
        List<Disciplina> disciplinas = this.getDisciplinasRestantes();
        disciplinas.forEach(d -> System.out.println(d.toString()));
    }


    public void imprimirDisciplinasMatriculadas() {
        disciplinasAtivas.forEach(d -> System.out.println(d.toString()));
    }

    public List<Disciplina> getDisciplinasCursadas() {
        return disciplinasCursadas;
    }

    public List<Disciplina> getDisciplinasEmAndamento() {
        return disciplinasAtivas;
    }

    public void matricularNaDisciplina(String nomeDisciplina) {
        Turma turma = curso.getTurmas().get(nomeDisciplina);
        if (turma == null) {
            System.out.println("disciplina, ou turma não existe, ou não está presente no seu curso");
            return;
        }
        Disciplina disciplina = turma.getDisciplina();
        if ((disciplina.isObrigatoria() && podeAdicionarDisciplinaObrigatoria()) || (!disciplina.isObrigatoria() && podeAdicionarDisciplinaOptativa())) {
            disciplinasAtivas.add(disciplina);
            turmasMatriculadas.add(turma);
         } else {
            String tipo = disciplina.isObrigatoria() ? "obrigatória" : "optativa";
            System.out.println("Você atingiu o limite de disciplinas " + tipo + " que podem ser cursadas");
        }

    }

    public void cancelarMatricula(String nomeDisciplina) {
        boolean removida = disciplinasAtivas.removeIf(disciplina -> disciplina.getNome().equals(nomeDisciplina));
        if (!removida) {
            turmasMatriculadas.removeIf(t -> t.getDisciplina().getNome().equals(nomeDisciplina));
            System.out.println("você não está matriculado nessa disciplina");
        }
    }

    private boolean podeAdicionarDisciplinaObrigatoria() {
        int qtdeDisciplinaObrigatoriasAtivas = disciplinasAtivas.stream().filter(Disciplina::isObrigatoria).collect(Collectors.toList()).size();
        return qtdeDisciplinaObrigatoriasAtivas < 4;
    }

    private boolean podeAdicionarDisciplinaOptativa() {
        int qtdeDisciplinaObrigatoriasAtivas = disciplinasAtivas.stream().filter(c -> !c.isObrigatoria()).collect(Collectors.toList()).size();
        return qtdeDisciplinaObrigatoriasAtivas < 1;
    }

}