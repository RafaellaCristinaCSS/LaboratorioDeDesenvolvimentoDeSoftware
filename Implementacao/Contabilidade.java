public class Contabilidade extends Usuario {
    public Contabilidade(String nome, String email, String senha, String cpf) {
        super(nome, email, senha, cpf);
    }

    public void cobrarAluno(Aluno aluno, String textoDaNotificacao) {
        aluno.setNotificacoes(textoDaNotificacao);
    }
}