import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Secretaria> membrosSecretarias;
    private List<Contabilidade> membrosContabilidades;
    private List<Curso> cursos;

    public Sistema() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.membrosSecretarias = new ArrayList<>();
        this.membrosContabilidades = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void addSecreateria(Secretaria s) {
        this.membrosSecretarias.add(s);
    }





    public Curso getCursoPeloNome(String nome) {
        return cursos.stream().filter(c -> c.getNome().equals(nome)).findFirst().orElse(null);
    }

    public Usuario login(TipoUsuario tipoUsuario, String email, String senha) {
         switch (tipoUsuario) {
            case ALUNO:  return findUserByEmailAndPassword(this.alunos, email, senha);
            case PROFESSOR: return findUserByEmailAndPassword(this.professores, email, senha);
            case SECRETARIA: return findUserByEmailAndPassword(this.membrosSecretarias, email, senha);
            case CONTABILIDADE:  return findUserByEmailAndPassword(this.membrosContabilidades, email, senha);
            default: return null;
        }
    }

    private Usuario findUserByEmailAndPassword(List<? extends Usuario> users, String email, String senha) {
        return users.stream()
                .filter(user -> user.getEmail().equals(email) && user.getSenha().equals(senha))
                .findFirst()
                .orElse(null);
    }

    public void signUp(TipoUsuario tipoUsuario, String nome, String email, String cpf, String senha) {
        if (tipoUsuario.equals(TipoUsuario.ALUNO) && findUserByEmailAndPassword(this.alunos, email, senha) == null) {
            this.alunos.add(new Aluno(nome,email, senha, cpf));
        }
        if (tipoUsuario.equals(TipoUsuario.PROFESSOR) && findUserByEmailAndPassword(this.professores, email, senha) == null){
            this.professores.add(new Professor(nome,email, senha, cpf));
        }
        if (tipoUsuario.equals(TipoUsuario.SECRETARIA) && findUserByEmailAndPassword(this.membrosSecretarias, email, senha) == null) {
            this.membrosSecretarias.add(new Secretaria(nome,email, senha, cpf));
        }
        if (tipoUsuario.equals(TipoUsuario.SECRETARIA) && findUserByEmailAndPassword(this.membrosContabilidades, email, senha) == null) {
            this.membrosContabilidades.add(new Contabilidade(nome,email, senha, cpf));
        }
    }




}