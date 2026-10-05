public class PerfectAndroid {

    private String nome;
    private Android[] androides = new Android[2];
    private int quantidade = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Android[] getAndroides() {
        return androides;
    }

    public void absorverAndroid(Android android) {
        androides[quantidade] = android;
        quantidade++;
    }
}
