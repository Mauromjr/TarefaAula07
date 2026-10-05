public class Funcionario {

    private String nome;
    private Dependente dependente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void adicionarDependente(String nome) {
        dependente = new Dependente(nome);
    }
}
