public class Disciplina{

    private String nome;  
    private int id;  
    private boolean obrigatoria;  
    private Integer semestre;
    private boolean ativa;  

    Anexo anexo = Anexo.getInstance();
    Disciplina(String nome, int id, boolean obrigatoria, boolean ativa, Integer semestre){
        this.nome = nome;
        this.id = id;
        this.obrigatoria = obrigatoria;
        this.ativa = ativa;
        this.semestre = semestre;
    }

    public void criarDisciplina(String nome, int id, boolean obrigatoria, boolean ativa){
        Disciplina disciplina = new Disciplina(nome, id, obrigatoria, ativa, 1);
    }
    public void setDisciplinas(){
        anexo.printarConteudoAnexoNoConsole("Disciplinas");
    }

    public boolean isObrigatoria() {
        return obrigatoria;
    }

    public void setObrigatoria(boolean obrigatoria) {
        this.obrigatoria = obrigatoria;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void encerrarMatriculas() {}

    @Override
    public String toString() {
        return "Nome: " + nome + ", Semestre: " + semestre;
    }

}