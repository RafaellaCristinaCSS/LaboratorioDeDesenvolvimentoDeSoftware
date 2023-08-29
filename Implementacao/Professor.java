public class Professor extends Usuario{
    public Professor(String nome, String email, String senha, String cpf) {
        super(nome, email, senha, cpf);
    }

    public void buscarAlunosPorDisciplinas() {
        System.out.println("buscar aluno por disciplina");
    }
}