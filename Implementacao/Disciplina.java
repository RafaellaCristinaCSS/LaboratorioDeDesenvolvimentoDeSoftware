public class Disciplina{
    private String nome;  
    private int id;  
    private boolean obrigatoria;  
    private boolean ativa;  

    Anexo anexo = Anexo.getInstance();
    private Disciplina(String nome, int id, boolean obrigatoria, boolean ativa){
        this.nome = nome;
        this.id = id;
        this.obrigatoria = obrigatoria;
        this.ativa = ativa;
    }

    public void criarDisciplina(String nome, int id, boolean obrigatoria, boolean ativa){
        Disciplina disciplina = new Disciplina(nome, id, obrigatoria, ativa);
    }
    public void encerrarMatriculas() {};
    public void setDisciplinas(){
        anexo.printarConteudoAnexoNoConsole("Disciplinas");
    }
}