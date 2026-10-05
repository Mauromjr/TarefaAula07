import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Contato c1 = new Contato();

        System.out.println("Qual seu nome: ");
        String nome = entrada.nextLine();
        c1.setNome(nome);

        System.out.println("Qual seu telefone: ");
        c1.setTelefone(entrada.nextLine());

        c1.exibeContato();

        entrada.close();
    }
}