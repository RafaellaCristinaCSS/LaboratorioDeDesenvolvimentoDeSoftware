import java.util.List;

public class Aluno extends Usuario{
    public Aluno(String nome, String email, String senha, String cpf) {
        super(nome, email, senha, cpf);
    }

    private String[] notificacoes;
    private int NumeroDeCreditos;
    private List<Disciplina> disciplinas;

    public void inscreverParaOProximoSemestre(){}
    public void matricularDisciplinas() {
        System.out.println("matricula disciplina");
    }

    public void cancelarMatrículasAnteriores() {}
    public void acessarContabilidade() {}
    public void setNotificacoes(String textoDaNotificacao){
        notificacoes[notificacoes.length-1] = textoDaNotificacao;
    }
}