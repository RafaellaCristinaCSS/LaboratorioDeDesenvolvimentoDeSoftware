public class Disciplina{
    private boolean obrigatoria;
    private Integer semestre;
    private String nome;

    public Disciplina(boolean obrigatoria, Integer semestre, String nome) {
        this.obrigatoria = obrigatoria;
        this.semestre = semestre;
        this.nome = nome;
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