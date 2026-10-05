import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private String nome;
    private List<Dependente> dependentes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarDependente(String nome) {
        dependentes.add(new Dependente(nome));
    }
}