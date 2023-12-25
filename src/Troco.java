import java.util.Locale;
import java.util.Scanner;

public class Troco {
    private double preco;
    private int qtde;
    private double dinheiro;

    public Troco(double preco, int qtde, double dinheiro) {
        this.preco = preco;
        this.qtde = qtde;
        this.dinheiro = dinheiro;
    }

    public double getTroco() {
        return dinheiro - (qtde * preco);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int qtde = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiro = sc.nextDouble();

        Troco troco = new Troco(preco, qtde, dinheiro);
        System.out.printf("TROCO = %.2f", troco.getTroco());
    }
}
