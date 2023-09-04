public class Contabilidade extends Usuario{
    /**
     * @param nome
     * @param email
     * @param senha
     * @param cpf
     */
    public Contabilidade(String nome, String email, String senha, String cpf) {
        super(nome, email, senha, cpf);
    }

    /**
     * @param aluno 
     */
    public void cobrarAluno( Aluno aluno, String textoDaNotificacao ) {
        aluno.setNotificacoes(textoDaNotificacao);
    }

    @Override
    public String toString() {
        return "Contabilidade []";
    }
}