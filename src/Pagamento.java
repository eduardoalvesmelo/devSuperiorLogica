import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
    private String nome;
    private double vlrHora;
    private int qtdeHora;

    public Pagamento(String nome, double vlrHora, int qtdeHora) {
        this.nome = nome;
        this.vlrHora = vlrHora;
        this.qtdeHora = qtdeHora;
    }

    public String getNome() {
        return nome;
    }

    public double getPagamento() {
        return vlrHora * qtdeHora;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Valor por hora: ");
        double vlrHora = sc.nextDouble();

        System.out.print("Horas trabalhadas: ");
        int qtdeHoras = sc.nextInt();

        Pagamento pagamento = new Pagamento(nome, vlrHora, qtdeHoras);
        System.out.printf("O pagamento para %s deve ser %.2f",pagamento.getNome(), pagamento.getPagamento());
    }
}
