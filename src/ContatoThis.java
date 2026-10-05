public class ContatoThis {

    private String nome;
    private String telefone;

    public void setNome(String nome) {
        // O this.nome representa o atributo do objeto, enquanto nome representa o parâmetro recebido pelo método.
        // O uso de this é necessário para diferenciar os dois quando possuem o mesmo nome.
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        // O this.telefone representa o atributo do objeto, enquanto telefone representa o parâmetro recebido pelo método.
        // O uso de this é necessário para diferenciar os dois quando possuem o mesmo nome.
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void exibeContato() {
        System.out.println("Contato - nome: " + nome + " | telefone: " + telefone);
    }
}
