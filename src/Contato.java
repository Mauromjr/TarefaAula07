public class Contato {

    private String nome;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        // O this.nome representa o atributo do objeto e nome representa o parâmetro recebido.
        // O this é necessário para diferenciar os dois quando possuem o mesmo nome.
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        // O this.telefone representa o atributo do objeto e telefone representa o parâmetro recebido.
        // O this é necessário para diferenciar os dois quando possuem o mesmo nome.
        this.telefone = telefone;
    }

    public void exibeContato() {
        System.out.println("Contato - nome: " + nome + " | telefone: " + telefone);
    }
}
