import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Aluno> alunos;
    private List<Professor> professors;
    private List<Secretaria> membrosSecretarias;
    private List<Contabilidade> membrosContabilidades;
    private List<Disciplina> disciplinas;
    public void filtraTipoUsuario() {}

    public Sistema() {
        this.alunos = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.membrosSecretarias = new ArrayList<>();
        this.membrosContabilidades = new ArrayList<>();
        this.disciplinas = new ArrayList<>();

    }

    public Usuario login(TipoUsuario tipoUsuario, String email, String senha) {
         switch (tipoUsuario) {
            case ALUNO:  return findUserByEmailAndPassword(this.alunos, email, senha);
            case PROFESSOR: return findUserByEmailAndPassword(this.professors, email, senha);
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
        if (tipoUsuario.equals(TipoUsuario.PROFESSOR) && findUserByEmailAndPassword(this.professors, email, senha) == null){
            this.professors.add(new Professor(nome,email, senha, cpf));
        }
        if (tipoUsuario.equals(TipoUsuario.SECRETARIA) && findUserByEmailAndPassword(this.membrosSecretarias, email, senha) == null) {
            this.membrosSecretarias.add(new Secretaria(nome,email, senha, cpf));
        }
        if (tipoUsuario.equals(TipoUsuario.SECRETARIA) && findUserByEmailAndPassword(this.membrosContabilidades, email, senha) == null) {
            this.membrosContabilidades.add(new Contabilidade(nome,email, senha, cpf));
        }
    }







}