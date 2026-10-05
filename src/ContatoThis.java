public class ContatoThis {

    private String nome;
    private String telefone;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
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