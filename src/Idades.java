import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Idades {
    private String nome1;
    private String nome2;
    private int idade1;
    private int idade2;

    public Idades(String nome1, String nome2, int idade1, int idade2) {
        this.nome1 = nome1;
        this.nome2 = nome2;
        this.idade1 = idade1;
        this.idade2 = idade2;
    }

    public String getNome1() {
        return nome1;
    }

    public String getNome2() {
        return nome2;
    }

    public double getIdadeMedia() {
        return (double) (idade1 + idade2) / 2;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Idade: ");
        int idade1 = sc.nextInt();
        System.out.println("Dados da segunda pessoa:");
        sc.nextLine();
        System.out.print("Nome: ");
        String nome2 = sc.nextLine();
        System.out.print("Idade: ");
        int idade2 = sc.nextInt();

        Idades idade = new Idades(nome1, nome2, idade1, idade2);
        System.out.printf("A idade média de %s e %s é de %.1f anos",idade.getNome1(), idade.getNome2(), idade.getIdadeMedia());
    }
}
